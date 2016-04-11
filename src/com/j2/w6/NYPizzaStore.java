package com.j2.w6;

public class NYPizzaStore extends PizzaStoreV2{
  PizzaV2 createPizza(String type){ //factory method. ��������� ��ü Ÿ���� subclass(run time)���� ����. ����� ����.
    if (type.equals("cheese")){
      return new NYStyleCheesePizza();
    } else if(type.equals("veggie")){
      return new NYStyleVeggiePizza();
    } else return null;
  }
}