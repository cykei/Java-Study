/*
 * @author cyi
 * @20160404
 * Decorator example - coffee 
 */

package com.j2.w5;

abstract class Beverage{
  String description="Unknown beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}

