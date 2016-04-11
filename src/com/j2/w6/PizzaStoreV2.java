package com.j2.w6;

/*
public abstract class PizzaStore {
  SimplePizzaFactory factory;
  public PizzaSotre(SimplePizzaFactory factory){
    this.factory=factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza=factory.createPizza(type);
    pizza.prepare();
  }
}
*/

public abstract class PizzaStoreV2{
  abstract PizzaV2 createPizza(String type);
  
  public PizzaV2 orderPizza(String type){ //orderPizza = templete ∆–≈œ 
    PizzaV2 pizza=createPizza(type);
    System.out.println("---Making a " +pizza.getName()+" ---");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}


                           