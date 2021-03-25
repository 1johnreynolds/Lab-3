
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

object paperView2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

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
            <h6><a href=""""),_display_(/*25.27*/routes/*25.33*/.HomeController.topicSelectionApi()),format.raw/*25.68*/("""">  <- return to topic Selection</a></h6>
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
                  DATE: 2021-03-25T01:30:28.795
                  SOURCE: /Users/huasucaster/Downloads/Lab-3/frontend/app/views/paperView2.scala.html
                  HASH: 71b9859f5ddcb85df141f45047e25b0589db6659
                  MATRIX: 965->1|1090->33|2538->1456|2553->1462|2609->1497|3043->1904|3091->1936|3130->1937|3183->1962|3288->2040|3310->2053|3338->2060|3506->2201|3528->2214|3556->2221|3724->2362|3746->2375|3774->2382|3944->2525|3966->2538|3994->2545|4165->2689|4187->2702|4216->2710|4390->2857|4412->2870|4440->2877|4610->3020|4632->3033|4660->3040|4828->3181|4850->3194|4878->3201|5043->3339|5065->3352|5093->3359|5259->3498|5281->3511|5309->3518|5480->3662|5502->3675|5530->3682|5700->3825|5722->3838|5751->3846|5924->3992|5946->4005|5975->4013|6144->4155|6166->4168|6195->4176|6368->4322|6390->4335|6419->4343|6591->4488|6613->4501|6642->4509|6810->4649|6833->4662|6863->4670|7033->4812|7056->4825|7086->4833|7259->4978|7282->4991|7312->4999|7406->5061|7456->5082
                  LINES: 28->1|33->2|56->25|56->25|56->25|67->36|67->36|67->36|68->37|70->39|70->39|70->39|74->43|74->43|74->43|78->47|78->47|78->47|82->51|82->51|82->51|86->55|86->55|86->55|90->59|90->59|90->59|94->63|94->63|94->63|98->67|98->67|98->67|102->71|102->71|102->71|106->75|106->75|106->75|110->79|110->79|110->79|114->83|114->83|114->83|118->87|118->87|118->87|122->91|122->91|122->91|126->95|126->95|126->95|130->99|130->99|130->99|134->103|134->103|134->103|138->107|138->107|138->107|142->111|142->111|142->111|145->114|146->115
                  -- GENERATED --
              */
          