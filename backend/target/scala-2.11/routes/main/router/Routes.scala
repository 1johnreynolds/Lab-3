
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Desktop/CS Master/CS7340/Lab3/backend/conf/routes
// @DATE:Tue Mar 23 12:48:52 CDT 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:11
  AbstractController_0: controllers.AbstractController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:11
    AbstractController_0: controllers.AbstractController
  ) = this(errorHandler, HomeController_1, AbstractController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, AbstractController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topicToPaper""", """controllers.AbstractController.FromTopicToPaper"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paperToMetadata""", """controllers.AbstractController.FromPaperToMetadata"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AbstractController_FromTopicToPaper1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topicToPaper")))
  )
  private[this] lazy val controllers_AbstractController_FromTopicToPaper1_invoker = createInvoker(
    AbstractController_0.FromTopicToPaper,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AbstractController",
      "FromTopicToPaper",
      Nil,
      "POST",
      """ An example controller showing a sample home page""",
      this.prefix + """topicToPaper"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AbstractController_FromPaperToMetadata2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paperToMetadata")))
  )
  private[this] lazy val controllers_AbstractController_FromPaperToMetadata2_invoker = createInvoker(
    AbstractController_0.FromPaperToMetadata,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AbstractController",
      "FromPaperToMetadata",
      Nil,
      "POST",
      """""",
      this.prefix + """paperToMetadata"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:11
    case controllers_AbstractController_FromTopicToPaper1_route(params) =>
      call { 
        controllers_AbstractController_FromTopicToPaper1_invoker.call(AbstractController_0.FromTopicToPaper)
      }
  
    // @LINE:12
    case controllers_AbstractController_FromPaperToMetadata2_route(params) =>
      call { 
        controllers_AbstractController_FromPaperToMetadata2_invoker.call(AbstractController_0.FromPaperToMetadata)
      }
  }
}
