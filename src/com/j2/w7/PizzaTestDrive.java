package com.j2.w7;

public class PizzaTestDrive{
  public static void main(String [] args){
    Pizza pizza=null;
    PizzaStore chicagoStore=new ChicagoPizzaStore();
    pizza=chicagoStore.orderPizza("cheese");
    pizza.prepare();
  }
}