/*
 * @author cyi
 * @20160404
 * Decorator example - coffee 
 */

package com.j2.w5;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roast Coffee";
  }
  public double cost() {
    return .99;
  }
}
