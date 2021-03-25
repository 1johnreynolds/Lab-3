
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
        </header>
        <div class="row">
            <div class="card col s3 ">
                <div class="card-panel">
                    <table border="1">
                        <th>
                        <form action=""""),_display_(/*30.40*/routes/*30.46*/.HomeController.paperSelection()),format.raw/*30.78*/("""" method="GET">
                            <button name="topic" type="submit" value="Topic1">Topic 1</button>
                        </form>
                        </th>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*36.48*/routes/*36.54*/.HomeController.paperSelection()),format.raw/*36.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic2">Topic 2</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*43.48*/routes/*43.54*/.HomeController.paperSelection()),format.raw/*43.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic3">Topic 3</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*50.48*/routes/*50.54*/.HomeController.paperSelection()),format.raw/*50.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic4">Topic 4</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*57.48*/routes/*57.54*/.HomeController.paperSelection()),format.raw/*57.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic5">Topic 5</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*64.48*/routes/*64.54*/.HomeController.paperSelection()),format.raw/*64.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic6">Topic 6</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*71.48*/routes/*71.54*/.HomeController.paperSelection()),format.raw/*71.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic7">Topic 7</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*78.48*/routes/*78.54*/.HomeController.paperSelection()),format.raw/*78.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic8">Topic 8</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*85.48*/routes/*85.54*/.HomeController.paperSelection()),format.raw/*85.86*/("""" method="GET">
                                    <button name="topic" type="submit" value="Topic9">Topic 9</button>
                                </form>
                            </th>
                        </tr>
                        <tr>
                            <th>
                                <form action=""""),_display_(/*92.48*/routes/*92.54*/.HomeController.paperSelection()),format.raw/*92.86*/("""" method="GET">
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

"""),format.raw/*105.62*/("""

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
                  DATE: 2021-03-24T14:21:44.346
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab3/Lab-3/Frontend/app/views/topicSelection.scala.html
                  HASH: 0f0d8b39a13d9cf69dce7020107d30a285e7d9db
                  MATRIX: 1039->0|2697->1633|2712->1639|2765->1671|3074->1953|3089->1959|3142->1991|3501->2323|3516->2329|3569->2361|3928->2693|3943->2699|3996->2731|4355->3063|4370->3069|4423->3101|4782->3433|4797->3439|4850->3471|5209->3803|5224->3809|5277->3841|5636->4173|5651->4179|5704->4211|6063->4543|6078->4549|6131->4581|6490->4913|6505->4919|6558->4951|6920->5345
                  LINES: 33->1|62->30|62->30|62->30|68->36|68->36|68->36|75->43|75->43|75->43|82->50|82->50|82->50|89->57|89->57|89->57|96->64|96->64|96->64|103->71|103->71|103->71|110->78|110->78|110->78|117->85|117->85|117->85|124->92|124->92|124->92|137->105
                  -- GENERATED --
              */
          