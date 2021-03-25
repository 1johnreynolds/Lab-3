// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/Lab-3/frontend/conf/routes
// @DATE:Thu Mar 25 00:41:12 CDT 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def paperSelection(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paperSelection")
    }
  
    // @LINE:8
    def topicSelection(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topicSelection")
    }
  
    // @LINE:13
    def topicSelectionApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topicSelectionApi")
    }
  
    // @LINE:15
    def paperView2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paperView2")
    }
  
    // @LINE:14
    def paperSelectionApi(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paperSelectionApi")
    }
  
    // @LINE:10
    def paperView1(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paperView1")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
