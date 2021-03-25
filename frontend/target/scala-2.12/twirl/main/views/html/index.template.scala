
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Lab 3</title>
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
        <strong>Lab 3</strong>
    </h1>
</header>
<div class="row">
    <div class="card col s3 ">
        <div class="card-panel">
            <table border="1">
                <th>
                    <form action=""""),_display_(/*30.36*/routes/*30.42*/.HomeController.topicSelection()),format.raw/*30.74*/("""">
                        <button name="data" type="submit" value="local">Local Database</button>
                    </form>
                </th>
                <tr>
                    <th>
                        <form action=""""),_display_(/*36.40*/routes/*36.46*/.HomeController.topicSelectionApi()),format.raw/*36.81*/("""" >
                            <button name="data" type="submit" value="aminer">AMiner API</button>
                        </form>
                    </th>
                </tr>
            </table>
        </div>
    </div>
</div>
</body>
</html>

"""),format.raw/*48.62*/("""

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
                  DATE: 2021-03-25T00:41:12.699
                  SOURCE: /Users/huasucaster/Downloads/Lab-3/frontend/app/views/index.scala.html
                  HASH: bc7775d259ccab5e4926006d930c0197e8504baa
                  MATRIX: 1030->0|2516->1461|2531->1467|2584->1499|2845->1733|2860->1739|2916->1774|3196->2087
                  LINES: 33->1|62->30|62->30|62->30|68->36|68->36|68->36|80->48
                  -- GENERATED --
              */
          