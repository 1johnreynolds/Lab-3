// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/Lab-3/frontend/conf/routes
// @DATE:Thu Mar 25 00:41:12 CDT 2021

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
  // @LINE:20
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:20
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
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topicSelection""", """controllers.HomeController.topicSelection()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paperSelection""", """controllers.HomeController.paperSelection()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paperView1""", """controllers.HomeController.paperView1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topicSelectionApi""", """controllers.HomeController.topicSelectionApi()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paperSelectionApi""", """controllers.HomeController.paperSelectionApi()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paperView2""", """controllers.HomeController.paperView2()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Part 1""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_topicSelection1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topicSelection")))
  )
  private[this] lazy val controllers_HomeController_topicSelection1_invoker = createInvoker(
    HomeController_1.topicSelection(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topicSelection",
      Nil,
      "GET",
      this.prefix + """topicSelection""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_paperSelection2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paperSelection")))
  )
  private[this] lazy val controllers_HomeController_paperSelection2_invoker = createInvoker(
    HomeController_1.paperSelection(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "paperSelection",
      Nil,
      "GET",
      this.prefix + """paperSelection""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_paperView13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paperView1")))
  )
  private[this] lazy val controllers_HomeController_paperView13_invoker = createInvoker(
    HomeController_1.paperView1(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "paperView1",
      Nil,
      "GET",
      this.prefix + """paperView1""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_topicSelectionApi4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topicSelectionApi")))
  )
  private[this] lazy val controllers_HomeController_topicSelectionApi4_invoker = createInvoker(
    HomeController_1.topicSelectionApi(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "topicSelectionApi",
      Nil,
      "GET",
      this.prefix + """topicSelectionApi""",
      """Part 2""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_paperSelectionApi5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paperSelectionApi")))
  )
  private[this] lazy val controllers_HomeController_paperSelectionApi5_invoker = createInvoker(
    HomeController_1.paperSelectionApi(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "paperSelectionApi",
      Nil,
      "GET",
      this.prefix + """paperSelectionApi""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_paperView26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paperView2")))
  )
  private[this] lazy val controllers_HomeController_paperView26_invoker = createInvoker(
    HomeController_1.paperView2(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "paperView2",
      Nil,
      "GET",
      this.prefix + """paperView2""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
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
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:8
    case controllers_HomeController_topicSelection1_route(params@_) =>
      call { 
        controllers_HomeController_topicSelection1_invoker.call(HomeController_1.topicSelection())
      }
  
    // @LINE:9
    case controllers_HomeController_paperSelection2_route(params@_) =>
      call { 
        controllers_HomeController_paperSelection2_invoker.call(HomeController_1.paperSelection())
      }
  
    // @LINE:10
    case controllers_HomeController_paperView13_route(params@_) =>
      call { 
        controllers_HomeController_paperView13_invoker.call(HomeController_1.paperView1())
      }
  
    // @LINE:13
    case controllers_HomeController_topicSelectionApi4_route(params@_) =>
      call { 
        controllers_HomeController_topicSelectionApi4_invoker.call(HomeController_1.topicSelectionApi())
      }
  
    // @LINE:14
    case controllers_HomeController_paperSelectionApi5_route(params@_) =>
      call { 
        controllers_HomeController_paperSelectionApi5_invoker.call(HomeController_1.paperSelectionApi())
      }
  
    // @LINE:15
    case controllers_HomeController_paperView26_route(params@_) =>
      call { 
        controllers_HomeController_paperView26_invoker.call(HomeController_1.paperView2())
      }
  
    // @LINE:20
    case controllers_Assets_at7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_0.at(path, file))
      }
  }
}
