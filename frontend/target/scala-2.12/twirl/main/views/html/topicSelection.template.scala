
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

object topicSelection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Lab 3 Topic Selection</title>
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
                <strong>Lab 3 Topic Selection</strong>
            </h1>
            <h6><a href=""""),_display_(/*24.27*/routes/*24.33*/.HomeController.index()),format.raw/*24.56*/("""">  <- return to Homepage</a></h6>
        </header>
        <div class="row">
            <div class="card col s3 ">
                <div class="card-panel">
                    <table border="1">
                        <th>
                        <form action=""""),_display_(/*31.40*/routes/*31.46*/.HomeController.paperSelection()),format.raw/*31.78*/("""" method="GET">
                            <button name="topic" type="submit" value="Topic1">Topic 1</button>
                        </form>
                        </th>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*37.48*/routes/*37.54*/.HomeController.paperSelection()),format.raw/*37.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic2">Topic 2</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*44.48*/routes/*44.54*/.HomeController.paperSelection()),format.raw/*44.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic3">Topic 3</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*51.48*/routes/*51.54*/.HomeController.paperSelection()),format.raw/*51.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic4">Topic 4</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*58.48*/routes/*58.54*/.HomeController.paperSelection()),format.raw/*58.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic5">Topic 5</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*65.48*/routes/*65.54*/.HomeController.paperSelection()),format.raw/*65.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic6">Topic 6</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*72.48*/routes/*72.54*/.HomeController.paperSelection()),format.raw/*72.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic7">Topic 7</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*79.48*/routes/*79.54*/.HomeController.paperSelection()),format.raw/*79.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic8">Topic 8</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*86.48*/routes/*86.54*/.HomeController.paperSelection()),format.raw/*86.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic9">Topic 9</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*93.48*/routes/*93.54*/.HomeController.paperSelection()),format.raw/*93.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic10">Topic 10</button>
                                </form>
                            </th>
                        </tr>

                    </table>
                </div>
            </div>
        </div>
    </body>
</html>

"""),format.raw/*106.62*/("""

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-25T02:48:18.026
                  SOURCE: /Users/huasucaster/Downloads/Lab-3/frontend/app/views/topicSelection.scala.html
                  HASH: dbd5b8d1f6a26c38d3874ed27f98281456f97ff3
                  MATRIX: 1039->0|2492->1428|2507->1434|2551->1457|2844->1723|2859->1729|2912->1761|3221->2043|3236->2049|3289->2081|3648->2413|3663->2419|3716->2451|4075->2783|4090->2789|4143->2821|4502->3153|4517->3159|4570->3191|4929->3523|4944->3529|4997->3561|5356->3893|5371->3899|5424->3931|5783->4263|5798->4269|5851->4301|6210->4633|6225->4639|6278->4671|6637->5003|6652->5009|6705->5041|7067->5435
                  LINES: 33->1|56->24|56->24|56->24|63->31|63->31|63->31|69->37|69->37|69->37|76->44|76->44|76->44|83->51|83->51|83->51|90->58|90->58|90->58|97->65|97->65|97->65|104->72|104->72|104->72|111->79|111->79|111->79|118->86|118->86|118->86|125->93|125->93|125->93|138->106
                  -- GENERATED --
              */
          