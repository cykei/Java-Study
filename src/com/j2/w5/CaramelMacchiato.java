/*
 * @author cyi
 * @20160404
 * Decorator example - coffee 
 */

package com.j2.w5;

public class CaramelMacchiato{
  public static void main(String []args) { 
    Beverage b=new Espresso();
    Beverage md=new Milk(b);
    Beverage cmd=new CaramelSyrup(md);
    
    System.out.println(cmd.getDescription());
    System.out.println(cmd.cost());
  }
}
