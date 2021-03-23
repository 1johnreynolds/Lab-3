// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Desktop/CS Master/CS7340/Lab3/frontend/conf/routes
// @DATE:Tue Mar 23 13:04:33 CDT 2021


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
