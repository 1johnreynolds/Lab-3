package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class pub_info {
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    public Long id;

    @Column(columnDefinition = "VARCHAR (250)NOT NULL DEFAULT ''")
    public String title;

    @Column(columnDefinition = "longtext")
    public String pub_abstract;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String mdate;

    @Column(columnDefinition = "VARCHAR(100)NOT NULL DEFAULT ''")
    public String author;

    @Column(columnDefinition = "VARCHAR(150)NOT NULL DEFAULT ''")
    public String author_list;

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



    /**
     * MySQL query that is utilized for Query 1.1, returns the metadata of Publication Title.
     * @return
     */
    public static List<SqlRow> findAll() {

        try{
            List<SqlRow> queryFindAll = Ebean.createSqlQuery("SELECT * FROM pub_info;")
                    .findList();
            return queryFindAll;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static List<SqlRow> getTitle(int id){
        try{
            List<SqlRow> queryFindTitle = Ebean.createSqlQuery("SELECT title FROM pub_info " +
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
            List<SqlRow> queryFindTitle = Ebean.createSqlQuery("SELECT * FROM pub_info " +
                    "where title='"+replacePunctuation(title)+"';")
                    .findList();
            return queryFindTitle;
        }catch(Exception e){
            e.printStackTrace();
            return null;
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


}
