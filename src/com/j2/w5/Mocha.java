/*
 * @author cyi
 * @20160404
 * Decorator example - coffee 
 */

package com.j2.w5;

public class Mocha extends CondimentDecorator {
  Beverage beverage;
  public Mocha(Beverage b) {
   this.beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
  public double cost() {
    return .20 + beverage.cost();
  }
}