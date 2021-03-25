package controllers;

import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.pub_info;
import models.pub_infoapi;
import models.topicwithtitle;
import models.topicwithtitleapi;
import play.libs.Json;
import play.mvc.Result;
import utils.TopicModeling;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static play.mvc.Controller.request;
import static play.mvc.Results.ok;

public class AbstractController {

    public Result trainmodel() {
        try {
            TopicModeling.trainTopic();
            return ok("Trainning completed");

        }
        catch (Exception e){
            return ok("false");
        }
    }

    public Result insertResulttoDatabase(){
        try {
            TopicModeling.getTopic();
            return ok("Insert completed");
        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result FromTopicToPaper(){
        System.out.println("In FromTopicToPaper");
        JsonNode req = request().body().asJson();
        String topic = req.get("topic").asText();
        //System.out.println("receive topic: "+topic);
        try {
            List<ObjectNode> queryTitle=getPaperFromTopic(topic);
            if (topic.equals("")){
                return ok("false");
            } else return ok(queryTitle.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result FromPaperToMetadata(){
        System.out.println("FromPaperToMetadata");
        JsonNode req = request().body().asJson();
        String title = req.get("title").asText();
        System.out.println("receive paper title: "+title);
        try {
            List<ObjectNode> queryTitle = getMetadataFromPaper(title);
            System.out.println(queryTitle);
            if (title.equals("")){
                return ok("false");
            } else return ok(queryTitle.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result FromTopicToPaperApi(){
        System.out.println("In FromTopicToPaperApi");
        JsonNode req = request().body().asJson();
        String topic = req.get("topic").asText();
        System.out.println("receive topic: "+topic);
        try {
            List<ObjectNode> queryTitle=getPaperFromTopicApi(topic);
            if (topic.equals("")){
                return ok("false");
            } else return ok(queryTitle.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    public Result FromPaperToMetadataApi(){
        System.out.println("FromPaperToMetadataApi");
        JsonNode req = request().body().asJson();
        String title = req.get("title").asText();
        System.out.println("receive paper title: "+title);
        try {
            List<ObjectNode> queryTitle = getMetadataFromPaperApi(title);
            System.out.println(queryTitle);
            if (title.equals("")){
                return ok("false");
            } else return ok(queryTitle.toString());

        }
        catch (Exception e) {
            return ok("false");
        }
    }

    //  Query titles from topic
    public List<ObjectNode> getPaperFromTopic(String topic) {
        List<ObjectNode> reslist= new ArrayList<>();
        try {
            List<SqlRow> pub = topicwithtitle.findTitleFromtopic(topic);
            if (pub.size()!= 0) {
                for (SqlRow pubs : pub) {
                    ObjectNode res = Json.newObject();
                    res.put("title", pubs.get("title").toString());
                    res.put("distribution", pubs.get("distribution").toString());

                    reslist.add(res);
                }
            } else {
                System.out.println(reslist.toString());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
    }





    //  Query matadate from metadata
    public List<ObjectNode> getMetadataFromPaperApi(String title) {
        List<ObjectNode> reslist= new ArrayList<>();
        try {
            System.out.println(title);
            String title1 = title.substring(1,title.length()-1);
            System.out.println(title1);
            List<SqlRow> pub = pub_infoapi.getMetadata(title1);
            System.out.println(pub.size());
            if (pub.size()!= 0) {
                for (SqlRow pubs : pub) {
                    System.out.println(pubs);
                    ObjectNode res = Json.newObject();
                    res.put("id", pubs.get("id").toString());
                    res.put("title", (String)pubs.get("title"));
                    res.put("mdate", (String)pubs.get("mdate"));
                    res.put("authors",(String) pubs.get("authors"));
                    res.put("article_key",(String) pubs.get("article_key"));
                    res.put("editors",(String)pubs.get("editors"));
                    res.put("pages", (String)pubs.get("pages"));
                    res.put("ee", (String)pubs.get("ee"));
                    res.put("pub_url", (String)pubs.get("pub_url"));
                    res.put("pub_year", pubs.get("pub_year").toString());
                    res.put("journal", (String)pubs.get("journal"));
                    res.put("book_title",(String) pubs.get("book_title"));
                    res.put("volume", pubs.get("volume").toString());
                    res.put("pub_number",pubs.get("pub_number").toString());
                    res.put("publisher", (String)pubs.get("publisher"));
                    res.put("isbn", (String)pubs.get("isbn"));
                    res.put("series", (String)pubs.get("series"));
                    res.put("cross_ref",(String) pubs.get("cross_ref"));
                    res.put("pub_abstract",(String)pubs.get("pub_apiabstract"));
                    System.out.println(res);
                    reslist.add(res);
                }
                System.out.println(reslist);
            } else {
                System.out.println(reslist.toString());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
    }

    //  Query titles from topic
    public List<ObjectNode> getPaperFromTopicApi(String topic) {
        List<ObjectNode> reslist= new ArrayList<>();
        try {
            List<SqlRow> pub = topicwithtitleapi.findTitleFromtopic(topic);
            if (pub.size()!= 0) {
                for (SqlRow pubs : pub) {
                    ObjectNode res = Json.newObject();
                    res.put("title", pubs.get("title").toString());
                    res.put("distribution", pubs.get("distribution").toString());

                    reslist.add(res);
                }
            } else {
                System.out.println(reslist.toString());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
    }





    //  Query matadate from metadata
    public List<ObjectNode> getMetadataFromPaper(String title) {
        List<ObjectNode> reslist= new ArrayList<>();
        try {
            System.out.println(title);
            String title1 = title.substring(1,title.length()-1);
            System.out.println(title1);
            List<SqlRow> pub = pub_info.getMetadata(title1);
            System.out.println(pub.size());
            if (pub.size()!= 0) {
                for (SqlRow pubs : pub) {
                    System.out.println(pubs);
                    ObjectNode res = Json.newObject();
                    res.put("id", pubs.get("id").toString());
                    res.put("title", (String)pubs.get("title"));
                    res.put("mdate", (String)pubs.get("mdate"));
                    res.put("authors",(String) pubs.get("authors"));
                    res.put("article_key",(String) pubs.get("article_key"));
                    res.put("editors",(String)pubs.get("editors"));
                    res.put("pages", (String)pubs.get("pages"));
                    res.put("ee", (String)pubs.get("ee"));
                    res.put("pub_url", (String)pubs.get("pub_url"));
                    res.put("pub_year", pubs.get("pub_year").toString());
                    res.put("journal", (String)pubs.get("journal"));
                    res.put("book_title",(String) pubs.get("book_title"));
                    res.put("volume", pubs.get("volume").toString());
                    res.put("pub_number",pubs.get("pub_number").toString());
                    res.put("publisher", (String)pubs.get("publisher"));
                    res.put("isbn", (String)pubs.get("isbn"));
                    res.put("series", (String)pubs.get("series"));
                    res.put("cross_ref",(String) pubs.get("cross_ref"));
                    res.put("pub_abstract",(String)pubs.get("pub_abstract"));
                    System.out.println(res);
                    reslist.add(res);
                }
                System.out.println(reslist);
            } else {
                System.out.println(reslist.toString());
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
    }
}
