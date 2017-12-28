
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/diegoizidoro/Dev/meetime-challenge/mee-carros-server/conf/routes
// @DATE:Thu Dec 28 04:32:48 BRST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:11
  class ReverseCarController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def update(pipedrive_token:String, id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/car/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pipedrive_token", pipedrive_token)))))
    }
  
    // @LINE:11
    def getAll(pipedrive_token:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/cars" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pipedrive_token", pipedrive_token)))))
    }
  
    // @LINE:22
    def delete(pipedrive_token:String, id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/car/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pipedrive_token", pipedrive_token)))))
    }
  
    // @LINE:16
    def get(pipedrive_token:String, id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/car/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pipedrive_token", pipedrive_token)))))
    }
  
    // @LINE:14
    def createCars(pipedrive_token:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/cars/create" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pipedrive_token", pipedrive_token)))))
    }
  
    // @LINE:18
    def add(pipedrive_token:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/car" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pipedrive_token", pipedrive_token)))))
    }
  
  }

  // @LINE:8
  class ReversePersonController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def persons(pipedrive_token:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/persons" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("pipedrive_token", pipedrive_token)))))
    }
  
  }

  // @LINE:31
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def at(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/html"), ("file", "index.html"))); _rrc
      Call("GET", _prefix)
    }
  
    // @LINE:34
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public/html"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
