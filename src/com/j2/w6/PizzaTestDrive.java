package com.j2.w6;

public class PizzaTestDrive{
  public static void main(String [] args){
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    
    Pizza cpizza = store.orderPizza("cheese"); //orderPizza는 store의 getInstance 함수.
    System.out.println("You ordered a " +cpizza.getName() + "\n");
    System.out.println(cpizza);
    
    Pizza vpizza= store.orderPizza("veggie");
    System.out.println("You ordered a " +vpizza.getName() + "\n");
    System.out.println(vpizza);
    
  }
}
