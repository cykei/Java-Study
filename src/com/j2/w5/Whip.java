/*
 * @author cyi
 * @20160404
 * Decorator example - coffee 
 */

package com.j2.w5;

public class Whip extends CondimentDecorator {
  Beverage beverage;
  public Whip(Beverage b){
    this.beverage=b;
  }
  public String getDescription() { 
    return beverage.getDescription() + ", Whip";
  }
  public double cost() {
    return .10 + beverage.cost();
  }
}