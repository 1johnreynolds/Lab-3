package controllers;

import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.pub_info;
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
    public Result generateTopic() throws Exception {
        System.out.println("In generateTopic");
//        JsonNode req = request().body().asJson();
//        String title = req.get("title").asText();
//        System.out.println("receive title: "+title);
//        TopicModeling.GetTopic();
        try {
            String query1_1="";
            return ok(query1_1);

        }
        catch (Exception e) {
            return ok("false");
        }
    }
    public List<ObjectNode> getMetadataUsingPaperName(String title) {
        List<ObjectNode> reslist= new ArrayList<>();
        try {
//            List<SqlRow> pub = pub_info.findByTitle_1_1(title);
//
//            if (pub.size()!= 0) {
//                for (SqlRow pubs : pub) {
//                    ObjectNode res = Json.newObject();
//                    res.put("pid", pubs.get("pid").toString());
//                    res.put("title", (String)pubs.get("title"));
//                    res.put("mdate", (String)pubs.get("mdate"));
//                    res.put("author",(String) pubs.get("author"));
//                    res.put("author_list", pubs.get("author_list").toString());
//                    res.put("article_key",(String) pubs.get("article_key"));
//                    res.put("editors",(String)pubs.get("editors"));
//                    res.put("pages", (String)pubs.get("pages"));
//                    res.put("ee", (String)pubs.get("ee"));
//                    res.put("pub_url", (String)pubs.get("pub_url"));
//                    res.put("pub_year", pubs.get("pub_year").toString());
//                    res.put("journal", (String)pubs.get("journal"));
//                    res.put("book_title",(String) pubs.get("book_title"));
//                    res.put("volume", pubs.get("volume").toString());
//                    res.put("pub_number",pubs.get("pub_number").toString());
//                    res.put("publisher", (String)pubs.get("publisher"));
//                    res.put("isbn", (String)pubs.get("isbn"));
//                    res.put("series", (String)pubs.get("series"));
//                    res.put("cross_ref",(String) pubs.get("cross_ref"));
//                    System.out.println(res);
//                    reslist.add(res);
//                }
//                System.out.println(reslist);
//            } else {
//                System.out.println(reslist.toString());
//            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return reslist;
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
