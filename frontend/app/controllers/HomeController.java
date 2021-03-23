package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;


import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
/**
 * File Name: HomeController.java
 *
 * This Controller handles Http Requests and Responses
 * from the backend then stores the values into a form used to display to user.
 * 
 * @author Beichen Hu, John Reynolds, Jianyu Shen, Jiachen Tang
 * @date March 7st, 2021
 * @since 1.0
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result index() {
        return ok(views.html.querySelection.render());
    }

    /**
     * Handles data and http response/request information for Query 1.1
     * @return
     */
    public CompletionStage<Result> queryOneHandler() {
        Form<topicwithtitle> publicationForm = formFactory.form(topicwithtitle.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Invalid topic";
            List<List<String>> wrongMessage = new ArrayList<>();
            wrongMessage.get(0).add(authorizeMessage);
            return (CompletionStage<Result>) badRequest(views.html.query1.render(wrongMessage));
        }

        return publicationForm.get().checkAuthorizedtopictopaper().thenApplyAsync((WSResponse r) -> {
            System.out.println("Body: "+ r.getBody());
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("false")) {
                JsonNode res = r.asJson();
                // add Title to session
                session("topic", publicationForm.get().getTitle());
                List<List<String>> res1 = new ArrayList<>();
                String query1 = "";
                for (int i = 0; i < res.size(); i++) {
                    JsonNode row = res.get(i);
                    List<String> curNode = new ArrayList<>();
                    curNode.add(""+row.findValue("title"));
                    curNode.add(""+row.findValue("distribution"));
                    res1.add(curNode);
                    System.out.println(query1);
                }
                return ok(views.html.query1.render(res1));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);

                return badRequest(views.html.query1.render(wrongMessage));
            }
        }, ec.current());
    }

    public CompletionStage<Result> queryTwoHandler() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Invalid publication Title";
            List<List<String>> wrongMessage = new ArrayList<>();
            wrongMessage.get(0).add(authorizeMessage);
            return (CompletionStage<Result>) badRequest(views.html.query1.render(wrongMessage));
        }

        return publicationForm.get().checkAuthorizedpapertometadata().thenApplyAsync((WSResponse r) -> {
            System.out.println("Body: "+ r.getBody());
            if (r.getStatus() == 200 && r.asJson() != null && !r.getBody().equals("false")) {
                JsonNode res = r.asJson();
                // add Title to session
                session("title", publicationForm.get().getTitle());
                List<List<String>> res1 = new ArrayList<>();
                String query1 = "";
                for (int i = 0; i < res.size(); i++) {
                    JsonNode row = res.get(i);
                    List<String> curNode = new ArrayList<>();
                    curNode.add(""+row.findValue("title"));
                    curNode.add(""+row.findValue("mdate"));
                    curNode.add(""+row.findValue("author_list"));
                    curNode.add(""+row.findValue("article_key"));
                    curNode.add(""+row.findValue("editors"));
                    curNode.add(""+row.findValue("pages"));
                    curNode.add(""+row.findValue("ee"));
                    curNode.add(""+row.findValue("pub_url"));
                    curNode.add(""+row.findValue("pub_year"));
                    curNode.add(""+row.findValue("journal"));
                    curNode.add(""+row.findValue("book_title"));
                    curNode.add(""+row.findValue("volume"));
                    curNode.add(""+row.findValue("pub_number"));
                    curNode.add(""+row.findValue("publisher"));
                    curNode.add(""+row.findValue("isbn"));
                    curNode.add(""+row.findValue("series"));
                    curNode.add(""+row.findValue("cross_ref"));
                    res1.add(curNode);

                }
                return ok(views.html.query2.render(res1));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);

                return badRequest(views.html.query2.render(wrongMessage));
            }
        }, ec.current());
    }




    /**
     * handle querySelection
     */
    public Result querySelectionHandler() {
        return ok(views.html.querySelection.render());
    }

    /**
     * Query page
     */
    public Result query1() {
        return ok(views.html.query1.render(new ArrayList<>()));
    }

    public Result query2() {
        return ok(views.html.query2.render(new ArrayList<>()));
    }


}