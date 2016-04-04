/*
 * @author cyi
 * @20160404
 * Decorator example - coffee 
 */

package com.j2.w5;

public class StarbuzzCoffee{
  public static void main(String []args) { 
    Beverage b=new DarkRoast();
    Beverage md=new Mocha(b);
    Beverage wmd=new Whip(md);
    
    System.out.println(wmd.getDescription());
    System.out.println(wmd.cost());
  }
}
