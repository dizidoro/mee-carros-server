
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/diegoizidoro/Dev/meetime-challenge/mee-carros-server/conf/routes
// @DATE:Thu Dec 28 04:32:48 BRST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  PersonController_1: controllers.PersonController,
  // @LINE:11
  CarController_2: controllers.CarController,
  // @LINE:31
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    PersonController_1: controllers.PersonController,
    // @LINE:11
    CarController_2: controllers.CarController,
    // @LINE:31
    Assets_0: controllers.Assets
  ) = this(errorHandler, PersonController_1, CarController_2, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PersonController_1, CarController_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/persons""", """controllers.PersonController.persons(pipedrive_token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cars""", """controllers.CarController.getAll(pipedrive_token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/cars/create""", """controllers.CarController.createCars(pipedrive_token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/car/""" + "$" + """id<[^/]+>""", """controllers.CarController.get(pipedrive_token:String, id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/car""", """controllers.CarController.add(pipedrive_token:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/car/""" + "$" + """id<[^/]+>""", """controllers.CarController.update(pipedrive_token:String, id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/car/""" + "$" + """id<[^/]+>""", """controllers.CarController.delete(pipedrive_token:String, id:Long)"""),
    ("""GET""", this.prefix, """controllers.Assets.at(path:String = "/public/html", file:String = "index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public/html", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_PersonController_persons0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/persons")))
  )
  private[this] lazy val controllers_PersonController_persons0_invoker = createInvoker(
    PersonController_1.persons(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "persons",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/persons""",
      """Person""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CarController_getAll1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cars")))
  )
  private[this] lazy val controllers_CarController_getAll1_invoker = createInvoker(
    CarController_2.getAll(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarController",
      "getAll",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/cars""",
      """Car""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_CarController_createCars2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/cars/create")))
  )
  private[this] lazy val controllers_CarController_createCars2_invoker = createInvoker(
    CarController_2.createCars(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarController",
      "createCars",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/cars/create""",
      """Car""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_CarController_get3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/car/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CarController_get3_invoker = createInvoker(
    CarController_2.get(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarController",
      "get",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """api/car/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_CarController_add4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/car")))
  )
  private[this] lazy val controllers_CarController_add4_invoker = createInvoker(
    CarController_2.add(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarController",
      "add",
      Seq(classOf[String]),
      "POST",
      this.prefix + """api/car""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CarController_update5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/car/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CarController_update5_invoker = createInvoker(
    CarController_2.update(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarController",
      "update",
      Seq(classOf[String], classOf[Long]),
      "PUT",
      this.prefix + """api/car/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CarController_delete6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/car/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CarController_delete6_invoker = createInvoker(
    CarController_2.delete(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CarController",
      "delete",
      Seq(classOf[String], classOf[Long]),
      "DELETE",
      this.prefix + """api/car/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_PersonController_persons0_route(params@_) =>
      call(params.fromQuery[String]("pipedrive_token", None)) { (pipedrive_token) =>
        controllers_PersonController_persons0_invoker.call(PersonController_1.persons(pipedrive_token))
      }
  
    // @LINE:11
    case controllers_CarController_getAll1_route(params@_) =>
      call(params.fromQuery[String]("pipedrive_token", None)) { (pipedrive_token) =>
        controllers_CarController_getAll1_invoker.call(CarController_2.getAll(pipedrive_token))
      }
  
    // @LINE:14
    case controllers_CarController_createCars2_route(params@_) =>
      call(params.fromQuery[String]("pipedrive_token", None)) { (pipedrive_token) =>
        controllers_CarController_createCars2_invoker.call(CarController_2.createCars(pipedrive_token))
      }
  
    // @LINE:16
    case controllers_CarController_get3_route(params@_) =>
      call(params.fromQuery[String]("pipedrive_token", None), params.fromPath[Long]("id", None)) { (pipedrive_token, id) =>
        controllers_CarController_get3_invoker.call(CarController_2.get(pipedrive_token, id))
      }
  
    // @LINE:18
    case controllers_CarController_add4_route(params@_) =>
      call(params.fromQuery[String]("pipedrive_token", None)) { (pipedrive_token) =>
        controllers_CarController_add4_invoker.call(CarController_2.add(pipedrive_token))
      }
  
    // @LINE:20
    case controllers_CarController_update5_route(params@_) =>
      call(params.fromQuery[String]("pipedrive_token", None), params.fromPath[Long]("id", None)) { (pipedrive_token, id) =>
        controllers_CarController_update5_invoker.call(CarController_2.update(pipedrive_token, id))
      }
  
    // @LINE:22
    case controllers_CarController_delete6_route(params@_) =>
      call(params.fromQuery[String]("pipedrive_token", None), params.fromPath[Long]("id", None)) { (pipedrive_token, id) =>
        controllers_CarController_delete6_invoker.call(CarController_2.delete(pipedrive_token, id))
      }
  
    // @LINE:31
    case controllers_Assets_at7_route(params@_) =>
      call(Param[String]("path", Right("/public/html")), Param[String]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:34
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public/html")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
