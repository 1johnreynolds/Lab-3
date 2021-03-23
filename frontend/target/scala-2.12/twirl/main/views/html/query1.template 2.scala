
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

import scala.util.parsing.json.JSONObject

object query1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Query 1</title>
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
                color: #57a957">
                <strong>Query 1</strong>
            </h1>
            <form action=""""),_display_(/*26.28*/routes/*26.34*/.HomeController.querySelectionHandler()),format.raw/*26.73*/("""" method="GET">
                    <button id="api-search-button1" class="btn col s4 offset-s4" type="submit">Return to Query Selection</button>
            </form>
        </header>

        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*34.36*/routes/*34.42*/.HomeController.queryOneHandler()),format.raw/*34.75*/("""" method="GET">
                        <h6> <b>Query 1:</b>
                            <br>Given a paper name (i.e., title), list its publication metadata.</h6>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="Title" name="Title" type="text" class="validate">
                                <label for="Title">Publication Title:</label>
                            </div>
                        </div>

                        """),_display_(/*45.26*/if(authorizeMessage!= null)/*45.53*/{_display_(Seq[Any](format.raw/*45.54*/("""
                        """),format.raw/*46.25*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*47.30*/authorizeMessage),format.raw/*47.46*/("""
                        """),format.raw/*48.25*/("""</div>
                        <br>
                        """)))}),format.raw/*50.26*/("""

                        """),format.raw/*52.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(q1Metadata:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(q1Metadata)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-01T22:36:03.444
                  SOURCE: /Users/beichenhu/Desktop/Service-Oriented Computing /Lab2/Front/Lab-2-frontend/app/views/query1.scala.html
                  HASH: 0a056a93366056a1cba491adc9bddfeee02b2a90
                  MATRIX: 949->1|1069->28|2498->1432|2513->1438|2573->1477|2936->1813|2951->1819|3005->1852|3563->2383|3599->2410|3638->2411|3691->2436|3794->2512|3831->2528|3884->2553|3976->2614|4030->2640
                  LINES: 28->1|33->2|57->26|57->26|57->26|65->34|65->34|65->34|76->45|76->45|76->45|77->46|78->47|78->47|79->48|81->50|83->52
                  -- GENERATED --
              */
          