
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

object query1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

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
        <strong>Query 1.1</strong>
    </h1>
    <form action=""""),_display_(/*32.20*/routes/*32.26*/.HomeController.querySelectionHandler()),format.raw/*32.65*/("""" method="GET">
        <button id="api-search-button1" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
    </form>
</header>

<div class="row">
    <div class="card col s4 offset-s4 ">
        <div class="card-panel">
            <form action=""""),_display_(/*40.28*/routes/*40.34*/.HomeController.queryOneHandler()),format.raw/*40.67*/("""" method="GET">
                <h6><b>Query 1.1:</b>
                    <br>It just a test for page topic to page paper.</h6>
                <div class="row">
                    <div class="input-field col s12">

                        <input id="topic" name="topic" type="text" class="validate">
                        <label for="topic">Topic:</label>
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
            <th>Distribution</th>
        </tr>
        """),_display_(/*61.10*/for(paperMetadata <- q1Metadata) yield /*61.42*/{_display_(Seq[Any](format.raw/*61.43*/("""
        """),format.raw/*62.9*/("""<tr>
            """),_display_(/*63.14*/for(curpaper <- paperMetadata) yield /*63.44*/{_display_(Seq[Any](format.raw/*63.45*/("""
            """),format.raw/*64.13*/("""<td>"""),_display_(/*64.18*/curpaper),format.raw/*64.26*/("""</td>
            """)))}),format.raw/*65.14*/("""
        """),format.raw/*66.9*/("""</tr>
        """)))}),format.raw/*67.10*/("""
    """),format.raw/*68.5*/("""</table>
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
                  DATE: 2021-03-23T11:59:26.458
                  SOURCE: /Users/huasucaster/Desktop/CS Master/CS7340/Lab3/frontend/app/views/query1.scala.html
                  HASH: dcd80d714831210d152f24701199cce6b681d2d9
                  MATRIX: 961->1|1086->33|2490->1412|2505->1418|2565->1457|2868->1733|2883->1739|2937->1772|3707->2515|3755->2547|3794->2548|3830->2557|3875->2575|3921->2605|3960->2606|4001->2619|4033->2624|4062->2632|4112->2651|4148->2660|4194->2675|4226->2680
                  LINES: 28->1|33->2|63->32|63->32|63->32|71->40|71->40|71->40|92->61|92->61|92->61|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|97->66|98->67|99->68
                  -- GENERATED --
              */
          