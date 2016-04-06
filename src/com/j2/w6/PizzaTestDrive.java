package com.j2.w6;

public class PizzaTestDrive{
  public static void main(String [] args){
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    
    Pizza pizza = store.orderPizza("cheese"); //orderPizza�� store�� getInstance �Լ�.
    System.out.println("You ordered a " +pizza.getName() + "\n");
    System.out.println(pizza);
    
    Pizza pizza= store.orderPizza("veggie");
    System.out.println("You ordered a " +pizza.getName() + "\n");
    System.out.println(pizza);
  }
}
