
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/diegoizidoro/Dev/meetime-challenge/mee-carros-server/conf/routes
// @DATE:Thu Dec 28 04:32:48 BRST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
