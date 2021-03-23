// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Desktop/CS Master/CS7340/Lab3/frontend/conf/routes
// @DATE:Tue Mar 23 13:04:33 CDT 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:24
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:24
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.querySelectionHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query1""", """controllers.HomeController.query1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """query2""", """controllers.HomeController.query2()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """querySelection""", """controllers.HomeController.querySelectionHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topicToPaper""", """controllers.HomeController.queryOneHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paperToMetadata""", """controllers.HomeController.queryTwoHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_querySelectionHandler0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_querySelectionHandler0_invoker = createInvoker(
    HomeController_1.querySelectionHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "querySelectionHandler",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_query11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query1")))
  )
  private[this] lazy val controllers_HomeController_query11_invoker = createInvoker(
    HomeController_1.query1(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query1",
      Nil,
      "GET",
      this.prefix + """query1""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_query22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("query2")))
  )
  private[this] lazy val controllers_HomeController_query22_invoker = createInvoker(
    HomeController_1.query2(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "query2",
      Nil,
      "GET",
      this.prefix + """query2""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_querySelectionHandler3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("querySelection")))
  )
  private[this] lazy val controllers_HomeController_querySelectionHandler3_invoker = createInvoker(
    HomeController_1.querySelectionHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "querySelectionHandler",
      Nil,
      "GET",
      this.prefix + """querySelection""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_queryOneHandler4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topicToPaper")))
  )
  private[this] lazy val controllers_HomeController_queryOneHandler4_invoker = createInvoker(
    HomeController_1.queryOneHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "queryOneHandler",
      Nil,
      "GET",
      this.prefix + """topicToPaper""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_queryTwoHandler5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paperToMetadata")))
  )
  private[this] lazy val controllers_HomeController_queryTwoHandler5_invoker = createInvoker(
    HomeController_1.queryTwoHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "queryTwoHandler",
      Nil,
      "GET",
      this.prefix + """paperToMetadata""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Assets_at6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_querySelectionHandler0_route(params@_) =>
      call { 
        controllers_HomeController_querySelectionHandler0_invoker.call(HomeController_1.querySelectionHandler())
      }
  
    // @LINE:9
    case controllers_HomeController_query11_route(params@_) =>
      call { 
        controllers_HomeController_query11_invoker.call(HomeController_1.query1())
      }
  
    // @LINE:11
    case controllers_HomeController_query22_route(params@_) =>
      call { 
        controllers_HomeController_query22_invoker.call(HomeController_1.query2())
      }
  
    // @LINE:15
    case controllers_HomeController_querySelectionHandler3_route(params@_) =>
      call { 
        controllers_HomeController_querySelectionHandler3_invoker.call(HomeController_1.querySelectionHandler())
      }
  
    // @LINE:17
    case controllers_HomeController_queryOneHandler4_route(params@_) =>
      call { 
        controllers_HomeController_queryOneHandler4_invoker.call(HomeController_1.queryOneHandler())
      }
  
    // @LINE:19
    case controllers_HomeController_queryTwoHandler5_route(params@_) =>
      call { 
        controllers_HomeController_queryTwoHandler5_invoker.call(HomeController_1.queryTwoHandler())
      }
  
    // @LINE:24
    case controllers_Assets_at6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(Assets_0.at(path, file))
      }
  }
}
