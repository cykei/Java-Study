package com.j2.w6;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) { //getInstance�� ������ �׻� object. ��, factory �����̴ϱ�� �Ҹ�...?
    Pizza pizza=null;
    if(type.equals("cheese")){
      pizza=new CheesePizza();
    } else if (type.equals("veggie")){
      pizza=new VeggiePizza();
    }
    return pizza;
  }
}