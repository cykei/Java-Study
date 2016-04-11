package com.j2.w6;

public class NYPizzaStore extends PizzaStoreV2{
  PizzaV2 createPizza(String type){ //factory method. 만들어지는 객체 타입을 subclass(run time)에서 결정. 상속이 존재.
    if (type.equals("cheese")){
      return new NYStyleCheesePizza();
    } else if(type.equals("veggie")){
      return new NYStyleVeggiePizza();
    } else return null;
  }
}