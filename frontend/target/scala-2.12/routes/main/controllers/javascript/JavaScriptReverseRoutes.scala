// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/Lab-3/frontend/conf/routes
// @DATE:Thu Mar 25 00:41:12 CDT 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def paperSelection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.paperSelection",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paperSelection"})
        }
      """
    )
  
    // @LINE:8
    def topicSelection: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topicSelection",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topicSelection"})
        }
      """
    )
  
    // @LINE:13
    def topicSelectionApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.topicSelectionApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topicSelectionApi"})
        }
      """
    )
  
    // @LINE:15
    def paperView2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.paperView2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paperView2"})
        }
      """
    )
  
    // @LINE:14
    def paperSelectionApi: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.paperSelectionApi",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paperSelectionApi"})
        }
      """
    )
  
    // @LINE:10
    def paperView1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.paperView1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paperView1"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
