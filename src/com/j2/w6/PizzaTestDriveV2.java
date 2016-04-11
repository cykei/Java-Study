package com.j2.w6;

public class PizzaTestDriveV2{
  public static void main(String[]args){
    PizzaStoreV2 nyStore=new NYPizzaStore();
    
    PizzaV2 pizza=nyStore.orderPizza("cheese");
    System.out.println(pizza.getName());
    
    System.out.println();
    
    pizza=nyStore.orderPizza("veggie");
    System.out.println(pizza.getName());
                                 
  }
}
