
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

object paperView1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q1Metadata:List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Lab 3 Paper Selection</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: black">
                <strong>Lab 3 Paper View</strong>
            </h1>
            <h6><a href=""""),_display_(/*25.27*/routes/*25.33*/.HomeController.topicSelection()),format.raw/*25.65*/("""">  <- return to topic Selection</a></h6>
        </header>
        <div class="row">
            <div class="card col s3 ">
                <div class="card-panel">
                    <table border="1">
                        <tr>
                            <th>Attribute</th>
                            <th>Value</th>
                        </tr>
                        <tr>
                            <th><h6>ID</h6></th>
                        </tr>
                        <tr>
                            <th><h6>Title</h6></th>
                        </tr>
                        <tr>
                            <th><h6>Date</h6></th>
                        </tr>
                        <tr>
                            <th><h6>Authors</h6></th>
                        </tr>
                        <tr>
                            <th><h6>Abstract</h6></th>
                        </tr>
                        """),_display_(/*50.26*/for(paperMetadata <- q1Metadata) yield /*50.58*/{_display_(Seq[Any](format.raw/*50.59*/("""
                            """),format.raw/*51.29*/("""<tr>
                            """),_display_(/*52.30*/for(curpaper <- paperMetadata) yield /*52.60*/{_display_(Seq[Any](format.raw/*52.61*/("""
                                """),format.raw/*53.33*/("""<td>"""),_display_(/*53.38*/curpaper),format.raw/*53.46*/("""</td>
                            """)))}),format.raw/*54.30*/("""
                            """),format.raw/*55.29*/("""</tr>
                        """)))}),format.raw/*56.26*/("""
                    """),format.raw/*57.21*/("""</table>
                </div>
            </div>
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
                  DATE: 2021-03-24T14:58:50.101
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab3/Lab-3/Frontend/app/views/paperView1.scala.html
                  HASH: 888fcbe55af00bb4d4a492d01f4a1ab0cc943a2b
                  MATRIX: 965->1|1090->33|2538->1456|2553->1462|2606->1494|3568->2429|3616->2461|3655->2462|3712->2491|3773->2525|3819->2555|3858->2556|3919->2589|3951->2594|3980->2602|4046->2637|4103->2666|4165->2697|4214->2718
                  LINES: 28->1|33->2|56->25|56->25|56->25|81->50|81->50|81->50|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|86->55|87->56|88->57
                  -- GENERATED --
              */
          