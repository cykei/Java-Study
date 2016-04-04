/*
 * @author cyi
 * @20160404
 * Decorator example - coffee 
 */

package com.j2.w5;

public class Espresso extends Beverage {
  public Espresso() {
    description = "Espresso";
  }
  public double cost() {
    return 1.99;
  }
}