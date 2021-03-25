package models;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.SqlUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class topicwithtitleapi {
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    public Long pid;

    @Column(columnDefinition = "VARCHAR (250)NOT NULL DEFAULT ''")
    public String topic;

    @Column(columnDefinition = "VARCHAR (250)NOT NULL DEFAULT ''")
    public String title;

    @Column(columnDefinition = "VARCHAR(100) NOT NULL DEFAULT ''")
    public String distribution;




    /**
     * MySQL query that is utilized for retrieving the title from specific title, returns the name of Title.
     * @return
     */

    public static void insertTopicWithValue(String topic, String title,String distribution){
        try{
            SqlUpdate insert = Ebean.createSqlUpdate("INSERT INTO topicwithtitleapi" +
                    " (topic, title, distribution) VALUES " +
                    "('"+topic+"','"+replacePunctuation(title)+"','"+distribution+"')");
            insert.execute();

        }catch(Exception e){
            e.printStackTrace();

        }
    }
    public static List<SqlRow> findTitleFromtopic(String topic){
        try{
            List<SqlRow> queryFindTitle = Ebean.createSqlQuery("SELECT * FROM topicwithtitleapi " +
                    "where topic='"+topic+"';")
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
