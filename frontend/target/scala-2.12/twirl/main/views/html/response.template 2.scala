
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

object response extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!--<!DOCTYPE html>-->
<!--<html>-->
<!--    <head>-->
<!--        <meta charset="utf-8">-->
<!--        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">-->

<!--        <title>Play Setup Demo</title>-->
<!--        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
<!--        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">-->

<!--            &lt;!&ndash; Compiled and minified JavaScript &ndash;&gt;-->
<!--        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>-->
<!--        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />-->
<!--        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>-->
<!--        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>-->
<!--    </head>-->
<!--    <body>-->

<!--        <header class="topbar">-->
<!--            <h1 class="focused" style="font-size: 37px;-->
<!--                color: #57a957">-->
<!--                <strong>Response</strong>-->
<!--            </h1>-->
<!--        <form action=""""),_display_(/*25.28*/routes/*25.34*/.HomeController.querySelectionHandler()),format.raw/*25.73*/("""">-->
<!--            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>-->
<!--        </form>-->
<!--        </header>-->

<!--        <div class="row">-->
<!--            <div class="card col s4 offset-s4 ">-->
<!--                <div class="card-panel">-->
<!--                    <form> """),_display_(/*33.33*/message),format.raw/*33.40*/(""" """),format.raw/*33.41*/("""</form>-->
<!--                </div>-->
<!--            </div>-->
<!--        </div>-->
<!--    </body>-->
<!--</html>-->
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-01T22:42:33.982
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/Front/Lab-2-frontend/app/views/response.scala.html
                  HASH: 7ab348d92a7ddfc44c298b552558464d38fb8561
                  MATRIX: 951->1|1062->19|2655->1587|2670->1593|2730->1632|3109->1984|3137->1991|3166->1992
                  LINES: 28->1|33->2|56->25|56->25|56->25|64->33|64->33|64->33
                  -- GENERATED --
              */
          