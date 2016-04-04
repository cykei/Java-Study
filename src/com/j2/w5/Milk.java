/*
 * @author cyi
 * @20160404
 * Decorator example - coffee 
 */

package com.j2.w5;

public class Milk extends CondimentDecorator {
  Beverage beverage;
  public Milk(Beverage b){
    this.beverage=b;
  }
  public String getDescription() { 
    return beverage.getDescription() + ", Milk";
  }
  public double cost() {
    return .10 + beverage.cost();
  }
}