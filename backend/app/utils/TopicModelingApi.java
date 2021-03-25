package utils;

import cc.mallet.pipe.*;
import cc.mallet.pipe.iterator.CsvIterator;
import cc.mallet.topics.ParallelTopicModel;
import cc.mallet.topics.TopicInferencer;
import cc.mallet.types.*;
import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.pub_info;
import models.pub_infoapi;
import models.topicwithtitle;
import models.topicwithtitleapi;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;


public class TopicModelingApi {

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
        InstanceList apiInstances = new InstanceList(new SerialPipes(pipeList));
        System.out.println("Loading data from database.");
        List<SqlRow> pub = pub_infoapi.findAll();
        int i=0;
        if (pub.size() != 0) {
            for (SqlRow pubs : pub) {
                i++;
                int temp = Integer.compare(i-1,apiInstances.size());
                String content = pubs.get("title") + " " + pubs.get("pub_abstract");
                content = content.replaceAll("\r|\n", " ");
                Reader fileReader = new StringReader(content);
                apiInstances.addThruPipe(new CsvIterator(fileReader, Pattern.compile("^(\\S*)[\\s,]*(\\S*)[\\s,]*(.*)$"),
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
        System.out.println(pub.size());
        System.out.println(apiInstances.size());
        System.out.println(apiInstances.toString());
        // Create a model with 100 topics, alpha_t = 0.01, beta_w = 0.01
        //  Note that the first parameter is passed as the sum over topics, while
        //  the second is the parameter for a single dimension of the Dirichlet prior.
        int numTopics = 10;
        //ParallelTopicModel model = new ParallelTopicModel(numTopics, 50, 0.01);

//        model.addInstances(instances);
//
//        // Use two parallel samplers, which each look at one half the corpus and combine
//        //  statistics after every iteration.
//        model.setNumThreads(8);
//
//        // Run the model for 50 iterations and stop (this is for testing only,
//        //  for real applications, use 1000 to 2000 iterations)
//        model.setNumIterations(500);
//        model.estimate();
//
//        savedmodel = model;
//        model.write(new File("model"));

        // Show the words and topics in the first instance
        // The data alphabet maps word IDs to strings
        dataAlphabet = apiInstances.getDataAlphabet();
        apiInstances.save(new File("apiInstances"));
        System.out.println("instance size:"+apiInstances.size());
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("The api instacnes is saved!");
    }

    public static void getApiTopic(){
        try{
            double threshold = 0.1;
            int numTopics=10;
            InstanceList newinstances = InstanceList.load(new File("apiInstances"));

            if (savedmodel == null) {
                savedmodel = ParallelTopicModel.read(new File("model"));
            }

            // Train new data incomes
            TopicInferencer infer = savedmodel.getInferencer();
            // instant
            for(int i = 0; i < newinstances.size();i++){
                double[] topicDistribution = infer.getSampledDistribution(newinstances.get(i),500,1,1);
                int article_id=i+1;
                for(int j = 0 ; j < topicDistribution.length;j++){
                    System.out.println("infer distribution: "+topicDistribution[j]);
                    System.out.println("model distribution: "+savedmodel.getTopicProbabilities(i)[j]);
                }
                for (int topic = 0; topic < numTopics; topic++) {
                    Formatter out = new Formatter(new StringBuilder(), Locale.US);
                    if (topicDistribution[topic] >= threshold) {
                        String title= pub_infoapi.getTitle(article_id).get(0).get("title").toString();
                        String topicstring="topic"+(topic+1);
                        String distribution=Double.toString(topicDistribution[topic]);
                        out.format("%d\t%.3f\t%s", topic+1, topicDistribution[topic], title);
                        topicwithtitleapi.insertTopicWithValue(topicstring,title,distribution);
                        System.out.println(out);
                    }
                }

            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void getTopic()  {
        List<ObjectNode> result =new ArrayList<>();


        try{
        double threshold = 0.1;
        InstanceList instancesToGetSize = InstanceList.load(new File("instances"));

        if (savedmodel == null) {
            savedmodel = ParallelTopicModel.read(new File("model"));
        }
        if (dataAlphabet == null) {
            dataAlphabet = instancesToGetSize.getDataAlphabet();
        }
        int numTopics = 10;
        for (int i = 0; i < instancesToGetSize.size(); i++) {
            int article_id = i + 1;
            int instanceID = article_id - 1;
            FeatureSequence tokens = (FeatureSequence) savedmodel.getData().get(instanceID).instance.getData();
            LabelSequence topics = savedmodel.getData().get(instanceID).topicSequence;



            // Estimate the topic distribution of the first instance,
            //  given the current Gibbs state.
            double[] topicDistribution = savedmodel.getTopicProbabilities(instanceID);

//        System.out.println("Instance size:"+InstanceList.load(new File("instances")).size());
//        System.out.println("Topic Distribution:"+topicDistribution.toString());
//        System.out.println("Tokens :"+tokens);
//        System.out.println("Topics :"+topics);

            // Get an array of sorted sets of word ID/count pairs
            ArrayList<TreeSet<IDSorter>> topicSortedWords = savedmodel.getSortedWords();
            //Json: topic1: {id1: matadate} {}
            // Show top 5 words in topics with proportions for the first document
            for (int topic = 0; topic < numTopics; topic++) {
                Iterator<IDSorter> iterator = topicSortedWords.get(topic).iterator();
                Formatter out = new Formatter(new StringBuilder(), Locale.US);
                if (topicDistribution[topic] >= threshold) {
                    String title= pub_info.getTitle(article_id).get(0).get("title").toString();
                    String topicstring="topic"+(topic+1);
                    String distribution=Double.toString(topicDistribution[topic]);
                    out.format("%d\t%.3f\t%s", topic+1, topicDistribution[topic], title);
                    topicwithtitle.insertTopicWithValue(topicstring,title,distribution);
//                    ObjectNode temp = Json.newObject();
//                    temp.put("topic",topic);
//                    temp.put("topicDistribution",topicDistribution[topic]);
//                    temp.put("title",title);
//                    result.add(temp);
                    System.out.println(out);
                }
            }
        }

//        for (int topic = 0; topic < numTopics; topic++) {
//            Iterator<IDSorter> iterator = topicSortedWords.get(topic).iterator();
//            Formatter out = new Formatter(new StringBuilder(), Locale.US);
//            out.format("%d\t%.3f\t", topic, topicDistribution[topic]);
//            int rank = 0;
//            while (iterator.hasNext() && rank < 5) {
//                IDSorter idCountPair = iterator.next();
//                out.format("%s (%.0f) ", dataAlphabet.lookupObject(idCountPair.getID()), idCountPair.getWeight());
//                rank++;
//            }
//            System.out.println(out);
//        }

        // Create a new instance with high probability of topic 0
//        StringBuilder topicZeroText = new StringBuilder();
//        Iterator<IDSorter> iterator = topicSortedWords.get(0).iterator();
//
//        int rank = 0;
//        while (iterator.hasNext() && rank < 5) {
//            IDSorter idCountPair = iterator.next();
//            topicZeroText.append(dataAlphabet.lookupObject(idCountPair.getID()) + " ");
//            rank++;
//        }

        // Create a new instance named "test instance" with empty target and source fields.
//        InstanceList testing = new InstanceList(InstanceList.load(new File("instances")).getPipe());
//        testing.addThruPipe(new Instance(topicZeroText.toString(), null, "test instance", null));
//
//        TopicInferencer inference = savedmodel.getInferencer();
//        double[] testProbabilities = inference.getSampledDistribution(testing.get(0), 10, 1, 5);
//        System.out.println("0\t" + testProbabilities[0]);

    }
        catch (Exception e) {
            System.out.println(e);
        }
//        System.out.println(result);


    }

//    public static List<String> getFileList(File file) {
//
//        List<String> result = new ArrayList<String>();
//
//        if (!file.isDirectory()) {
//            System.out.println(file.getAbsolutePath());
//            result.add(file.getAbsolutePath());
//        } else {
//            File[] directoryList = file.listFiles(new FileFilter() {
//                public boolean accept(File file) {
//                    if (file.isFile() && file.getName().indexOf("txt") > -1) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//                }
//            });
//            for (int i = 0; i < directoryList.length; i++) {
//                result.add(directoryList[i].getPath());
//            }
//        }
//
//        return result;
//    }
//
//
//    public static void WriteTxt(String filename, String fileContent){
//        BufferedWriter writer = null;
//        try
//        {
//            writer = new BufferedWriter( new FileWriter(filename));
//            writer.write(fileContent);
//
//        }
//        catch ( IOException e)
//        {
//        }
//        finally
//        {
//            try
//            {
//                if ( writer != null)
//                    writer.close( );
//            }
//            catch ( IOException e)
//            {
//            }
//        }
//
//    }
}


