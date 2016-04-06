package com.j2.w6;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) { //getInstance의 리턴은 항상 object. 즉, factory 패턴이니까란 소리...?
    Pizza pizza=null;
    if(type.equals("cheese")){
      pizza=new CheesePizza();
    } else if (type.equals("veggie")){
      pizza=new VeggiePizza();
    }
    return pizza;
  }
}