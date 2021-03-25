
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/Lab-3/backend/conf/routes
// @DATE:Thu Mar 25 00:43:24 CDT 2021

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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topicToPaperApi""", """controllers.AbstractController.FromTopicToPaperApi"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paperToMetadataApi""", """controllers.AbstractController.FromPaperToMetadataApi"""),
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
      """ Part 1""",
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

  // @LINE:15
  private[this] lazy val controllers_AbstractController_FromTopicToPaperApi3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topicToPaperApi")))
  )
  private[this] lazy val controllers_AbstractController_FromTopicToPaperApi3_invoker = createInvoker(
    AbstractController_0.FromTopicToPaperApi,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AbstractController",
      "FromTopicToPaperApi",
      Nil,
      "POST",
      """ Part 2""",
      this.prefix + """topicToPaperApi"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AbstractController_FromPaperToMetadataApi4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paperToMetadataApi")))
  )
  private[this] lazy val controllers_AbstractController_FromPaperToMetadataApi4_invoker = createInvoker(
    AbstractController_0.FromPaperToMetadataApi,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AbstractController",
      "FromPaperToMetadataApi",
      Nil,
      "POST",
      """""",
      this.prefix + """paperToMetadataApi"""
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
  
    // @LINE:15
    case controllers_AbstractController_FromTopicToPaperApi3_route(params) =>
      call { 
        controllers_AbstractController_FromTopicToPaperApi3_invoker.call(AbstractController_0.FromTopicToPaperApi)
      }
  
    // @LINE:16
    case controllers_AbstractController_FromPaperToMetadataApi4_route(params) =>
      call { 
        controllers_AbstractController_FromPaperToMetadataApi4_invoker.call(AbstractController_0.FromPaperToMetadataApi)
      }
  }
}
