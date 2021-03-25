
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/huasucaster/Downloads/Lab-3/backend/conf/routes
// @DATE:Thu Mar 25 00:43:24 CDT 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAbstractController AbstractController = new controllers.ReverseAbstractController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAbstractController AbstractController = new controllers.javascript.ReverseAbstractController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
