package utils;

import cc.mallet.util.*;
import cc.mallet.types.*;
import cc.mallet.pipe.*;
import cc.mallet.pipe.iterator.*;
import cc.mallet.topics.*;

import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.pub_info;


import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.regex.*;
import java.io.*;

public class TopicModeling {

    public static ParallelTopicModel savedmodel;
    public static Alphabet dataAlphabet;

    public static void trainTopic() throws Exception {

        // Begin by importing documents from text to feature sequences
        ArrayList<Pipe> pipeList = new ArrayList<Pipe>();
        Instant start = Instant.now();

        // Pipes: lowercase, tokenize, remove stopwords, map to features
        pipeList.add(new CharSequenceLowercase());
        pipeList.add(new CharSequence2TokenSequence(Pattern.compile("\\p{L}[\\p{L}\\p{P}]+\\p{L}")));
        pipeList.add(new TokenSequenceRemoveStopwords(new File("stoplists/en.txt"), "UTF-8", false, false, false));
        pipeList.add(new TokenSequence2FeatureSequence());
        InstanceList instances = new InstanceList(new SerialPipes(pipeList));
        System.out.println("Loading data from database.");
        List<SqlRow> pub = pub_info.findAll();
        if (pub.size() != 0) {
            for (SqlRow pubs : pub) {
                String content = pubs.get("title") + " " + pubs.get("pub_abstract");
                Reader fileReader = new StringReader(content);
                instances.addThruPipe(new CsvIterator(fileReader, Pattern.compile("^(\\S*)[\\s,]*(\\S*)[\\s,]*(.*)$"),
                        3, 2, 1));
            }
        }
//        String FILE_IN = "abstract";
//        File f = new File(FILE_IN);
//        List<String> list = new ArrayList<String>();
//        list = getFileList(f);
//        System.out.println(list.size());
//        String content="";
//        List<SqlRow> pub = pub_info.findAll();
////
//            if (pub.size()!= 0) {
//                for (SqlRow pubs : pub) {
//                    content += pubs.get("pub_abstract");
//                }
//            }
//
//            WriteTxt("abstract.txt",content);
//
//            System.out.println(content);
        //for(String l: list){
//        Reader fileReader = new InputStreamReader(new FileInputStream(new File("abstract.txt")), "UTF-8");
//        instances.addThruPipe(new CsvIterator (fileReader, Pattern.compile("^(\\S*)[\\s,]*(\\S*)[\\s,]*(.*)$"),
//                3, 2, 1));
        // } // data, label, name fields
        System.out.println(instances.size());
        System.out.println(instances.toString());
        // Create a model with 100 topics, alpha_t = 0.01, beta_w = 0.01
        //  Note that the first parameter is passed as the sum over topics, while
        //  the second is the parameter for a single dimension of the Dirichlet prior.
        int numTopics = 10;
        ParallelTopicModel model = new ParallelTopicModel(numTopics, 50, 0.01);

        model.addInstances(instances);

        // Use two parallel samplers, which each look at one half the corpus and combine
        //  statistics after every iteration.
        model.setNumThreads(8);

        // Run the model for 50 iterations and stop (this is for testing only,
        //  for real applications, use 1000 to 2000 iterations)
        model.setNumIterations(500);
        model.estimate();

        savedmodel = model;
        model.write(new File("model"));

        // Show the words and topics in the first instance
        // The data alphabet maps word IDs to strings
        dataAlphabet = instances.getDataAlphabet();
        instances.save(new File("instances"));
        System.out.println("instance size:"+instances.size());
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("The training is completed!");
    }

    public static List<String> getTopic(String title_id) throws Exception{

        if(savedmodel == null){
            savedmodel = ParallelTopicModel.read(new File("model"));
        }
        if(dataAlphabet == null){
            dataAlphabet = InstanceList.load(new File("instances")).getDataAlphabet();
        }

        List<String> content=new ArrayList<>();
        int numTopics = 10;

        int instanceID = Integer.parseInt(title_id)-1;
        FeatureSequence tokens = (FeatureSequence) savedmodel.getData().get(instanceID).instance.getData();
        LabelSequence topics = savedmodel.getData().get(instanceID).topicSequence;


        /**
         * Maybe need to use again
         */
//        Formatter out = new Formatter(new StringBuilder(), Locale.US);
//        for (int position = 0; position < tokens.getLength(); position++) {
//            out.format("%s-%d ", dataAlphabet.lookupObject(tokens.getIndexAtPosition(position)), topics.getIndexAtPosition(position));
//        }
//        System.out.println(out);
        /**
         * Maybe need to use again
         */


        // Estimate the topic distribution of the first instance,
        //  given the current Gibbs state.
        double[] topicDistribution = savedmodel.getTopicProbabilities(instanceID);
        System.out.println("Topic Distribution:"+topicDistribution.toString());
        System.out.println("Tokens :"+tokens);
        System.out.println("Topics :"+topics);

        // Get an array of sorted sets of word ID/count pairs
        ArrayList<TreeSet<IDSorter>> topicSortedWords = savedmodel.getSortedWords();
        //Json: topic1: {id1: matadate} {}
        // Show top 5 words in topics with proportions for the first document
        for (int topic = 0; topic < numTopics; topic++) {
            Iterator<IDSorter> iterator = topicSortedWords.get(topic).iterator();
            Formatter out = new Formatter(new StringBuilder(), Locale.US);
            out.format("%d\t%.3f\t", topic, topicDistribution[topic]);
            int rank = 0;
            while (iterator.hasNext() && rank < 5) {
                IDSorter idCountPair = iterator.next();
                out.format("%s (%.0f) ", dataAlphabet.lookupObject(idCountPair.getID()), idCountPair.getWeight());
                rank++;
            }
            System.out.println(out);
        }

        // Create a new instance with high probability of topic 0
        StringBuilder topicZeroText = new StringBuilder();
        Iterator<IDSorter> iterator = topicSortedWords.get(0).iterator();

        int rank = 0;
        while (iterator.hasNext() && rank < 5) {
            IDSorter idCountPair = iterator.next();
            topicZeroText.append(dataAlphabet.lookupObject(idCountPair.getID()) + " ");
            rank++;
        }

        // Create a new instance named "test instance" with empty target and source fields.
        InstanceList testing = new InstanceList(InstanceList.load(new File("instances")).getPipe());
        testing.addThruPipe(new Instance(topicZeroText.toString(), null, "test instance", null));

        TopicInferencer inferencer = savedmodel.getInferencer();
        double[] testProbabilities = inferencer.getSampledDistribution(testing.get(0), 10, 1, 5);
        System.out.println("0\t" + testProbabilities[0]);
        return content;
    }

    public static List<String> getFileList(File file) {

        List<String> result = new ArrayList<String>();

        if (!file.isDirectory()) {
            System.out.println(file.getAbsolutePath());
            result.add(file.getAbsolutePath());
        } else {
            File[] directoryList = file.listFiles(new FileFilter() {
                public boolean accept(File file) {
                    if (file.isFile() && file.getName().indexOf("txt") > -1) {
                        return true;
                    } else {
                        return false;
                    }
                }
            });
            for (int i = 0; i < directoryList.length; i++) {
                result.add(directoryList[i].getPath());
            }
        }

        return result;
    }


    public static void WriteTxt(String filename, String fileContent){
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter( new FileWriter(filename));
            writer.write(fileContent);

        }
        catch ( IOException e)
        {
        }
        finally
        {
            try
            {
                if ( writer != null)
                    writer.close( );
            }
            catch ( IOException e)
            {
            }
        }

    }
}


