
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
        <div class="row" >
            <div class="card col s3 " >
                <div class="card-panel"  style="width: 120rem;">
                    <table border="1" >
                        <tr>
                            <th>Attribute</th>
                            <th>Value</th>
                        </tr>

                        """),_display_(/*36.26*/for(paperMetadata <- q1Metadata) yield /*36.58*/{_display_(Seq[Any](format.raw/*36.59*/("""
                        """),format.raw/*37.25*/("""<tr>
                            <td>ID</td>
                            <td>"""),_display_(/*39.34*/paperMetadata/*39.47*/.get(0)),format.raw/*39.54*/("""</td>
                        </tr>
                        <tr>
                            <td>Title</td>
                            <td>"""),_display_(/*43.34*/paperMetadata/*43.47*/.get(1)),format.raw/*43.54*/("""</td>
                        </tr>
                        <tr>
                            <td>Mdate</td>
                            <td>"""),_display_(/*47.34*/paperMetadata/*47.47*/.get(2)),format.raw/*47.54*/("""</td>
                        </tr>
                        <tr>
                            <td>Authors</td>
                            <td>"""),_display_(/*51.34*/paperMetadata/*51.47*/.get(3)),format.raw/*51.54*/("""</td>
                        </tr>
                        <tr>
                            <td>Abstract</td>
                            <td>"""),_display_(/*55.34*/paperMetadata/*55.47*/.get(18)),format.raw/*55.55*/("""</td>
                        </tr>
                        <tr>
                            <td>Article Key</td>
                            <td>"""),_display_(/*59.34*/paperMetadata/*59.47*/.get(4)),format.raw/*59.54*/("""</td>
                        </tr>
                        <tr>
                            <td>Editors</td>
                            <td>"""),_display_(/*63.34*/paperMetadata/*63.47*/.get(5)),format.raw/*63.54*/("""</td>
                        </tr>
                        <tr>
                            <td>Pages</td>
                            <td>"""),_display_(/*67.34*/paperMetadata/*67.47*/.get(6)),format.raw/*67.54*/("""</td>
                        </tr>
                        <tr>
                            <td>EE</td>
                            <td>"""),_display_(/*71.34*/paperMetadata/*71.47*/.get(7)),format.raw/*71.54*/("""</td>
                        </tr>
                        <tr>
                            <td>URL</td>
                            <td>"""),_display_(/*75.34*/paperMetadata/*75.47*/.get(8)),format.raw/*75.54*/("""</td>
                        </tr>
                        <tr>
                            <td>Pub_year</td>
                            <td>"""),_display_(/*79.34*/paperMetadata/*79.47*/.get(9)),format.raw/*79.54*/("""</td>
                        </tr>
                        <tr>
                            <td>Journal</td>
                            <td>"""),_display_(/*83.34*/paperMetadata/*83.47*/.get(10)),format.raw/*83.55*/("""</td>
                        </tr>
                        <tr>
                            <td>Book_title</td>
                            <td>"""),_display_(/*87.34*/paperMetadata/*87.47*/.get(11)),format.raw/*87.55*/("""</td>
                        </tr>
                        <tr>
                            <td>Volume</td>
                            <td>"""),_display_(/*91.34*/paperMetadata/*91.47*/.get(12)),format.raw/*91.55*/("""</td>
                        </tr>
                        <tr>
                            <td>Pub_number</td>
                            <td>"""),_display_(/*95.34*/paperMetadata/*95.47*/.get(13)),format.raw/*95.55*/("""</td>
                        </tr>
                        <tr>
                            <td>Publisher</td>
                            <td>"""),_display_(/*99.34*/paperMetadata/*99.47*/.get(14)),format.raw/*99.55*/("""</td>
                        </tr>
                        <tr>
                            <td>ISBN</td>
                            <td>"""),_display_(/*103.34*/paperMetadata/*103.47*/.get(15)),format.raw/*103.55*/("""</td>
                        </tr>
                        <tr>
                            <td>Series</td>
                            <td>"""),_display_(/*107.34*/paperMetadata/*107.47*/.get(16)),format.raw/*107.55*/("""</td>
                        </tr>
                        <tr>
                            <td>Cross_ref</td>
                            <td>"""),_display_(/*111.34*/paperMetadata/*111.47*/.get(17)),format.raw/*111.55*/("""</td>
                        </tr>

                        """)))}),format.raw/*114.26*/("""
                    """),format.raw/*115.21*/("""</table>
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
                  DATE: 2021-03-24T22:47:03.908
                  SOURCE: /Users/huasucaster/Downloads/Lab-3/frontend/app/views/paperView1.scala.html
                  HASH: a98de0b504d9672efe57af922f6b5d4650762b50
                  MATRIX: 965->1|1090->33|2538->1456|2553->1462|2606->1494|3040->1901|3088->1933|3127->1934|3180->1959|3285->2037|3307->2050|3335->2057|3503->2198|3525->2211|3553->2218|3721->2359|3743->2372|3771->2379|3941->2522|3963->2535|3991->2542|4162->2686|4184->2699|4213->2707|4387->2854|4409->2867|4437->2874|4607->3017|4629->3030|4657->3037|4825->3178|4847->3191|4875->3198|5040->3336|5062->3349|5090->3356|5256->3495|5278->3508|5306->3515|5477->3659|5499->3672|5527->3679|5697->3822|5719->3835|5748->3843|5921->3989|5943->4002|5972->4010|6141->4152|6163->4165|6192->4173|6365->4319|6387->4332|6416->4340|6588->4485|6610->4498|6639->4506|6807->4646|6830->4659|6860->4667|7030->4809|7053->4822|7083->4830|7256->4975|7279->4988|7309->4996|7403->5058|7453->5079
                  LINES: 28->1|33->2|56->25|56->25|56->25|67->36|67->36|67->36|68->37|70->39|70->39|70->39|74->43|74->43|74->43|78->47|78->47|78->47|82->51|82->51|82->51|86->55|86->55|86->55|90->59|90->59|90->59|94->63|94->63|94->63|98->67|98->67|98->67|102->71|102->71|102->71|106->75|106->75|106->75|110->79|110->79|110->79|114->83|114->83|114->83|118->87|118->87|118->87|122->91|122->91|122->91|126->95|126->95|126->95|130->99|130->99|130->99|134->103|134->103|134->103|138->107|138->107|138->107|142->111|142->111|142->111|145->114|146->115
                  -- GENERATED --
              */
          