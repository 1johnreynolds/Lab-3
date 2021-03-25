
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

object paperSelection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

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
                <strong>Lab 3 Paper Selection</strong>
            </h1>
            <h6><a href=""""),_display_(/*25.27*/routes/*25.33*/.HomeController.topicSelection()),format.raw/*25.65*/("""">  <- return to Topic Selection</a></h6>
        </header>
        <div class="row">
            <div class="card col s5">
                <div class="card-panel">
                    <table border="1">

                        <tr>
                            <th> Paper Title </th>
                            <th> Distribution </th>
                        </tr>

                        <script> var t = "test"</script>
                            """),_display_(/*38.30*/for(paperMetadata <- q1Metadata) yield /*38.62*/{_display_(Seq[Any](format.raw/*38.63*/("""
                                """),format.raw/*39.33*/("""<tr>
                                    <td>"""),_display_(/*40.42*/paperMetadata/*40.55*/.get(0)),format.raw/*40.62*/("""</td>
                                    <td>"""),_display_(/*41.42*/paperMetadata/*41.55*/.get(1)),format.raw/*41.62*/("""</td>
                                    <td>
                                        <form action=""""),_display_(/*43.56*/routes/*43.62*/.HomeController.paperView1()),format.raw/*43.90*/("""" method="GET">
                                            <button id = "button1" name="title" type="submit" value= """"),_display_(/*44.104*/paperMetadata/*44.117*/.get(0)),format.raw/*44.124*/("""">Check Detail</button>
                                        </form>
                                    </td>
                                </tr>
                           """)))}),format.raw/*48.29*/("""

                    """),format.raw/*50.21*/("""</table>
                </div>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q1Metadata:List[List[String]],size:Integer): play.twirl.api.HtmlFormat.Appendable = apply(q1Metadata,size)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (q1Metadata) => apply(q1Metadata)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-24T16:25:10.243
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab3/Lab-3/frontend/app/views/paperSelection.scala.html
                  HASH: 38793e9e6f9522804de63c763c9f7aa4c7d22fe0
                  MATRIX: 969->1|1094->33|2547->1461|2562->1467|2615->1499|3096->1953|3144->1985|3183->1986|3244->2019|3317->2065|3339->2078|3367->2085|3441->2132|3463->2145|3491->2152|3620->2254|3635->2260|3684->2288|3831->2407|3854->2420|3883->2427|4094->2607|4144->2629
                  LINES: 28->1|33->2|56->25|56->25|56->25|69->38|69->38|69->38|70->39|71->40|71->40|71->40|72->41|72->41|72->41|74->43|74->43|74->43|75->44|75->44|75->44|79->48|81->50
                  -- GENERATED --
              */
          