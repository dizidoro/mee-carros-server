
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/diegoizidoro/Dev/meetime-challenge/mee-carros-server/conf/routes
// @DATE:Thu Dec 28 04:32:48 BRST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseCarController CarController = new controllers.ReverseCarController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePersonController PersonController = new controllers.ReversePersonController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseCarController CarController = new controllers.javascript.ReverseCarController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePersonController PersonController = new controllers.javascript.ReversePersonController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
