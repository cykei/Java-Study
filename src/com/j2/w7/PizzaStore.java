package com.j2.w7;

public abstract class PizzaStore{
  protected abstract Pizza createPizza(String type);
  
  public Pizza orderPizza(String type){ //orderPizza = templete ∆–≈œ 
    Pizza pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
