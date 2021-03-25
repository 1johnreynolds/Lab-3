
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

object paperSelection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[List[String]],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(q1Metadata:List[List[String]], size:Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
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
                <strong>Lab 3 Paper Selection: Number is: """),_display_(/*24.60*/size),format.raw/*24.64*/("""</strong>
            </h1>
            <h6><a href=""""),_display_(/*26.27*/routes/*26.33*/.HomeController.topicSelection()),format.raw/*26.65*/("""">  <- return to Topic Selection</a></h6>
        </header>
        <div class="row">
            <div class="card col s5">
                <div class="card-panel">
                    <table border="1">

                        <tr>
                            <th> Paper Title </th>
                            <th> Distribution </th>
                        </tr>
                        """),_display_(/*37.26*/for(paperMetadata <- q1Metadata) yield /*37.58*/{_display_(Seq[Any](format.raw/*37.59*/("""
                            """),format.raw/*38.29*/("""<tr>
                                <td>"""),_display_(/*39.38*/paperMetadata/*39.51*/.get(0)),format.raw/*39.58*/("""</td>
                                <td>"""),_display_(/*40.38*/paperMetadata/*40.51*/.get(1)),format.raw/*40.58*/("""</td>
                                <td>
                                    <form action=""""),_display_(/*42.52*/routes/*42.58*/.HomeController.paperView1()),format.raw/*42.86*/("""" method="GET">
                                        <button id = "button1" name="title" type="submit" value= """"),_display_(/*43.100*/paperMetadata/*43.113*/.get(0)),format.raw/*43.120*/("""">Check Detail</button>
                                    </form>
                                </td>
                            </tr>
                        """)))}),format.raw/*47.26*/("""

                    """),format.raw/*49.21*/("""</table>
                </div>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q1Metadata:List[List[String]],size:Integer): play.twirl.api.HtmlFormat.Appendable = apply(q1Metadata,size)

  def f:((List[List[String]],Integer) => play.twirl.api.HtmlFormat.Appendable) = (q1Metadata,size) => apply(q1Metadata,size)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-25T02:44:04.491
                  SOURCE: /Users/huasucaster/Downloads/Lab-3/frontend/app/views/paperSelection.scala.html
                  HASH: d241f4ce557b4d78188edc568427454e92bba442
                  MATRIX: 977->1|1116->47|1143->48|2556->1436|2581->1440|2662->1494|2677->1500|2730->1532|3149->1924|3197->1956|3236->1957|3293->1986|3362->2028|3384->2041|3412->2048|3482->2091|3504->2104|3532->2111|3653->2205|3668->2211|3717->2239|3860->2354|3883->2367|3912->2374|4108->2539|4158->2561
                  LINES: 28->1|33->2|34->3|55->24|55->24|57->26|57->26|57->26|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|71->40|71->40|73->42|73->42|73->42|74->43|74->43|74->43|78->47|80->49
                  -- GENERATED --
              */
          