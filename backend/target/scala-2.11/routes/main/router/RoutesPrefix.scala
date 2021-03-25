
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/Lab-3/backend/conf/routes
// @DATE:Thu Mar 25 00:43:24 CDT 2021


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
