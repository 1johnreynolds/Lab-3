package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.SqlUpdate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.IOException;
import java.util.List;

import utils.HttpResponse;
import utils.HttpUtil;

@Entity
public class pub_infoapi {
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    public Long id;

    @Column(columnDefinition = "VARCHAR (250)NOT NULL DEFAULT ''")
    public String title;

//    @Column(columnDefinition = "longtext")
//    public String pub_abstract;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String mdate;

    @Column(columnDefinition = "VARCHAR(100)NOT NULL DEFAULT ''")
    public String authors;

//    @Column(columnDefinition = "VARCHAR(150)NOT NULL DEFAULT ''")
//    public String author_list;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String article_key;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String editors;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL DEFAULT ''")
    public String pages;

    @Column(columnDefinition = "VARCHAR(200) NOT NULL DEFAULT ''")
    public String ee;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String pub_url;

    @Column(columnDefinition = "INT DEFAULT 0000")
    public int pub_year;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String journal;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String book_title;

    @Column(columnDefinition = "INT NOT NULL DEFAULT 0")
    public int volume;

    @Column(columnDefinition = "INT NOT NULL DEFAULT 0")
    public int pub_number;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String publisher;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL DEFAULT ''")
    public String isbn;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String series;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String cross_ref;

    @Column(columnDefinition = "longtext")
    public String pub_apiabstract;



    //    public static CompletionStage<WSResponse> getAbstractContent(String title) throws IOException {
    public static String getAbstractContent(String title) throws IOException {
        String abstractContent =null;
        //  WSClient ws = play.test.WSTestClient.newClient(9005);

//        String title = "'Performance Impact of Web Service Migration in Embedded Environments'";
        title = "'" + title + "'";
        String url = "/pub?query=" + replacePunctuationNew(title) + "&sort=relevance&size=1";
//        WSRequest request = ws.url(" + title + "size=1");
//        ObjectNode res = Json.newObject();
//        res.put("title", this.title);

        //String url = "/login?username=" + username + "&password=" + password;
        HttpResponse response = HttpUtil.makeRequest(url, "GET", null);
        if (response.getStatusCode() == 200) {
            // System.out.println(response.getResponse());

            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(response.getResponse());
            // System.out.println("Begin of new print");
            // System.out.println(node.get("result").get(0).get("abstract"));
            System.out.println(node.get("result"));
            if(node.get("result").get(0)==null){
                return null;
            }
            try {
                abstractContent = node.get("result").get(0).get("abstract").asText();
            }catch(Exception e){
                e.printStackTrace();
                //continue;
            }
            // System.out.println(abstractContent);
            // System.out.println("Begin of new print");
            // System.out.println(node.at("/result").asText());
            //return ok(views.html.index.render(response.getResponse()));
        }
        // return null;
        return abstractContent;
    }

    public static void updateAbstractContent() throws IOException {
        List<SqlRow> allContent = findAll();
        System.out.println(allContent.size());
        int length = allContent.size();
        for (int i = 0; i < length; i++) {
            int idNow = i + 1;
            //SqlRow title = Ebean.createSqlQuery("SELECT title FROM lab3.pub_infoapi WHERE id=" + idNow).findUnique();
            String title = allContent.get(i).get("title").toString();
            String abstractContent = getAbstractContent(title);
            if(abstractContent==null){
                continue;
            }
            insertAbstractContent(idNow,abstractContent);
        }

    }

    /**
     * MySQL query that is utilized for Query 1.1, returns the metadata of Publication Title.
     * @return
     */
    public static List<SqlRow> findAll() {

        try{
            List<SqlRow> queryFindAll = Ebean.createSqlQuery("SELECT * FROM pub_infoapi;")
                    .findList();
            return queryFindAll;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static List<SqlRow> getTitle(int id){
        try{
            List<SqlRow> queryFindTitle = Ebean.createSqlQuery("SELECT title FROM pub_infoapi " +
                    "where id="+id+";")
                    .findList();
            return queryFindTitle;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static List<SqlRow> getMetadata(String title){
        try{
            List<SqlRow> queryFindTitle = Ebean.createSqlQuery("SELECT * FROM pub_infoapi " +
                    "where title like'"+replacePunctuation(title)+"';")
                    .findList();
            return queryFindTitle;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static void insertAbstractContent(int id, String apiabstract){
        try{
            SqlUpdate insert = Ebean.createSqlUpdate("Update pub_infoapi SET " +
                    "pub_apiabstract= '"+replacePunctuation(apiabstract)+"'" +
                    " WHERE id= "+id+";");
            insert.execute();

        }catch(Exception e){
            e.printStackTrace();

        }
    }

    /**
     * Replaces punctuation in string.
     *
     * @param str
     * @return
     */
    public static String replacePunctuation(String str) {
        if(str==null){
            return str;
        }
        String returnStr = "";
        if(str.indexOf("'") != -1) {
            returnStr = str.replaceAll("'", "''");
            str = returnStr;
        }
        return str;
    }

    public static String replacePunctuationNew(String str) {
        if (str == null) {
            return str;
        }
        String returnStr = "";
        if (str.indexOf("'") != -1) {
            // original code from the Internet
            // returnStr = str.replace("'", "''");
            returnStr = str.replaceAll(" ", "%20");
            str = returnStr;
        }
        return str;
    }

}
