package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public CompletionStage<Result> paperSelection() {
        Form<topicwithtitle> publicationForm = formFactory.form(topicwithtitle.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Invalid topic";
            List<List<String>> wrongMessage = new ArrayList<>();
            wrongMessage.get(0).add(authorizeMessage);
            return (CompletionStage<Result>) badRequest(views.html.paperSelection.render(wrongMessage,0));
        }


        return publicationForm.get().checkAuthorizedtopictopaper().thenApplyAsync((WSResponse r) -> {
            //System.out.println("Body: "+ r.getBody());
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
                    //System.out.println(query1);
                }
                return ok(views.html.paperSelection.render(res1,res.size()));


            } else {
                //System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);

                return badRequest(views.html.paperSelection.render(wrongMessage,0));
            }
        }, ec.current());
    }

    public CompletionStage<Result> paperView1() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Invalid publication Title";
            List<List<String>> wrongMessage = new ArrayList<>();
            wrongMessage.get(0).add(authorizeMessage);
            return (CompletionStage<Result>) badRequest(views.html.paperView1.render(wrongMessage));
        }
        System.out.println(publicationForm.get().getTitle());

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
                    curNode.add(""+row.findValue(("id")));
                    curNode.add(""+row.findValue("title"));
                    curNode.add(""+row.findValue("mdate"));
                    curNode.add(""+row.findValue("authors"));
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
                    curNode.add(""+row.findValue("pub_abstract"));
                    res1.add(curNode);
                    System.out.println(res1);
                }
                return ok(views.html.paperView1.render(res1));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);

                return badRequest(views.html.paperView1.render(wrongMessage));
            }
        }, ec.current());
    }

    public CompletionStage<Result> paperSelectionApi() {
        Form<topicwithtitle> publicationForm = formFactory.form(topicwithtitle.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Invalid topic";
            List<List<String>> wrongMessage = new ArrayList<>();
            wrongMessage.get(0).add(authorizeMessage);
            return (CompletionStage<Result>) badRequest(views.html.paperSelectionApi.render(wrongMessage,0));
        }


        return publicationForm.get().checkAuthorizedtopictopaperApi().thenApplyAsync((WSResponse r) -> {
            //System.out.println("Body: "+ r.getBody());
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
                    //System.out.println(query1);
                }
                return ok(views.html.paperSelectionApi.render(res1,res.size()));


            } else {
                //System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);

                return badRequest(views.html.paperSelectionApi.render(wrongMessage,0));
            }
        }, ec.current());
    }

    public CompletionStage<Result> paperView2() {
        Form<Publication> publicationForm = formFactory.form(Publication.class).bindFromRequest();
        if (publicationForm.hasErrors()){
            String authorizeMessage = "Invalid publication Title";
            List<List<String>> wrongMessage = new ArrayList<>();
            wrongMessage.get(0).add(authorizeMessage);
            return (CompletionStage<Result>) badRequest(views.html.paperView2.render(wrongMessage));
        }
        System.out.println(publicationForm.get().getTitle());

        return publicationForm.get().checkAuthorizedpapertometadataApi().thenApplyAsync((WSResponse r) -> {
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
                    curNode.add(""+row.findValue(("id")));
                    curNode.add(""+row.findValue("title"));
                    curNode.add(""+row.findValue("mdate"));
                    curNode.add(""+row.findValue("authors"));
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
                    curNode.add(""+row.findValue("pub_abstract"));
                    res1.add(curNode);
                    System.out.println(res1);
                }
                return ok(views.html.paperView2.render(res1));


            } else {
                System.out.println("response null");
                String authorizeMessage = "Invalid publication Title";
                List<List<String>> wrongMessage = new ArrayList<>();
                List<String> curWrong = new ArrayList<>();
                curWrong.add(authorizeMessage);
                wrongMessage.add(curWrong);

                return badRequest(views.html.paperView2.render(wrongMessage));
            }
        }, ec.current());
    }

    public Result topicSelection() {return ok(views.html.topicSelection.render());}
    public Result topicSelectionApi() {return ok(views.html.topicSelectionApi.render());}
    public Result index() {return ok(views.html.index.render());}

}