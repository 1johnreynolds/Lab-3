
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

object querySelection extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>DBLP Query Options</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>

    <header class="topbar">
        <h1 class="focused" style="font-size: 37px;
                color: #57a957">
            <strong>DBLP Query Options</strong>
            <h4> Select a Query: </h4>
        </h1>
    </header>
    <body>
        <h6> <b>topictopaper:</b>
            <br>It just a test for page topic to page paper.
        </h6>
            <form action=""""),_display_(/*29.28*/routes/*29.34*/.HomeController.query1()),format.raw/*29.58*/("""">
                <div class="row">
                    <button id="select-query-1" class="btn" type="select">Select</button>
                </div>
            </form>
    </body>
    <body>
        <h6> <b>papertometadata:</b>
            <br>It just a test for page paper to page metadata.
        </h6>
        <form action=""""),_display_(/*39.24*/routes/*39.30*/.HomeController.query2()),format.raw/*39.54*/("""">
            <div class="row">
                <button id="select-query-1" class="btn" type="select">Select</button>
            </div>
        </form>

    </body>
</html>
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
                  DATE: 2021-03-23T13:05:50.685
                  SOURCE: /Users/huasucaster/Desktop/CS Master/CS7340/Lab3/frontend/app/views/querySelection.scala.html
                  HASH: c0300efefdb890becd2ac1893b79ac6f5c45ff6f
                  MATRIX: 1039->0|2635->1571|2650->1577|2695->1601|3053->1932|3068->1938|3113->1962
                  LINES: 33->1|61->29|61->29|61->29|71->39|71->39|71->39
                  -- GENERATED --
              */
          