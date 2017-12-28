
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/diegoizidoro/Dev/meetime-challenge/mee-carros-server/conf/routes
// @DATE:Thu Dec 28 04:32:48 BRST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:11
  class ReverseCarController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarController.update",
      """
        function(pipedrive_token0,id1) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/car/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id1)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pipedrive_token", pipedrive_token0)])})
        }
      """
    )
  
    // @LINE:11
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarController.getAll",
      """
        function(pipedrive_token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cars" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pipedrive_token", pipedrive_token0)])})
        }
      """
    )
  
    // @LINE:22
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarController.delete",
      """
        function(pipedrive_token0,id1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/car/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id1)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pipedrive_token", pipedrive_token0)])})
        }
      """
    )
  
    // @LINE:16
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarController.get",
      """
        function(pipedrive_token0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/car/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id1)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pipedrive_token", pipedrive_token0)])})
        }
      """
    )
  
    // @LINE:14
    def createCars: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarController.createCars",
      """
        function(pipedrive_token0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/cars/create" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pipedrive_token", pipedrive_token0)])})
        }
      """
    )
  
    // @LINE:18
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CarController.add",
      """
        function(pipedrive_token0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/car" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pipedrive_token", pipedrive_token0)])})
        }
      """
    )
  
  }

  // @LINE:8
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def persons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.persons",
      """
        function(pipedrive_token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/persons" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("pipedrive_token", pipedrive_token0)])})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:34
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
