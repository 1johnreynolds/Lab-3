
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Desktop/CS Master/CS7340/Lab3/backend/conf/routes
// @DATE:Tue Mar 23 12:48:52 CDT 2021

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:11
  class ReverseAbstractController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def FromTopicToPaper: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AbstractController.FromTopicToPaper",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "topicToPaper"})
        }
      """
    )
  
    // @LINE:12
    def FromPaperToMetadata: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AbstractController.FromPaperToMetadata",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paperToMetadata"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
