
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object query2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q1Metadata:List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 1.1</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico"/>
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css"
        integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ=="
        crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js"
        integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og=="
        crossorigin=""></script>
    </head>

    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>query2</strong>
            </h1>
            <form action=""""),_display_(/*32.28*/routes/*32.34*/.HomeController.querySelectionHandler()),format.raw/*32.73*/("""" method="GET">
                <button id="api-search-button1" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*40.36*/routes/*40.42*/.HomeController.queryTwoHandler()),format.raw/*40.75*/("""" method="GET">
                        <h6><b>Test for query2:</b>
                            <br>Given a paper name (i.e., title), list its publication metadata.</h6>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="title" name="title" type="text" class="validate">
                                <label for="title">Publication Title:</label>
                            </div>
                        </div>

                        <div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
            <table border="1">
                <tr>
                    <th>Title</th>
                    <th>Mdate</th>
                    <th>Author List</th>
                    <th>Article Key</th>
                    <th>Editors</th>
                    <th>Pages</th>
                    <th>EE</th>
                    <th>Pub_url</th>
                    <th>Pub_year</th>
                    <th>Journal</th>
                    <th>Book_title(Conference Name)</th>
                    <th>Volume</th>
                    <th>Pub_number</th>
                    <th>Publisher</th>
                    <th>ISBN</th>
                    <th>Series</th>
                    <th>Cross_ref</th>
                </tr>
                """),_display_(/*78.18*/for(paperMetadata <- q1Metadata) yield /*78.50*/{_display_(Seq[Any](format.raw/*78.51*/("""
                    """),format.raw/*79.21*/("""<tr>
                    """),_display_(/*80.22*/for(curpaper <- paperMetadata) yield /*80.52*/{_display_(Seq[Any](format.raw/*80.53*/("""
                        """),format.raw/*81.25*/("""<td>"""),_display_(/*81.30*/curpaper),format.raw/*81.38*/("""</td>
                    """)))}),format.raw/*82.22*/("""
                    """),format.raw/*83.21*/("""</tr>
                """)))}),format.raw/*84.18*/("""
            """),format.raw/*85.13*/("""</table>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q1Metadata:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(q1Metadata)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (q1Metadata) => apply(q1Metadata)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-23T13:04:33.986
                  SOURCE: /Users/huasucaster/Desktop/CS Master/CS7340/Lab3/frontend/app/views/query2.scala.html
                  HASH: 4381649a9325e13a4354eaa029d0e05f13106616
                  MATRIX: 961->1|1086->33|2563->1485|2578->1491|2638->1530|2997->1862|3012->1868|3066->1901|4608->3416|4656->3448|4695->3449|4744->3470|4797->3496|4843->3526|4882->3527|4935->3552|4967->3557|4996->3565|5054->3592|5103->3613|5157->3636|5198->3649
                  LINES: 28->1|33->2|63->32|63->32|63->32|71->40|71->40|71->40|109->78|109->78|109->78|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|114->83|115->84|116->85
                  -- GENERATED --
              */
          