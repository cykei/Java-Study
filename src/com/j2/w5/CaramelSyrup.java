/*
 * @author cyi
 * @20160404
 * Decorator example - coffee 
 */

package com.j2.w5;

public class CaramelSyrup extends CondimentDecorator {
  Beverage beverage;
  public CaramelSyrup(Beverage b){
    this.beverage=b;
  }
  public String getDescription() { 
    return beverage.getDescription() + ", Caramel Syrup ";
  }
  public double cost() {
    return .10 + beverage.cost();
  }
}