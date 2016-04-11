package com.j2.w6;

import java.util.ArrayList;

public abstract class PizzaV2{ //abstract�� ���°� å���� �׷��� �ϴϱ�. ���� �� �ʿ��� �� �ƴϴ�.
  public String name;
  ArrayList toppings = new ArrayList();
  
  void prepare(){
    System.out.println("preparing "+name);
    for(int i=0; i<toppings.size(); i++){
      System.out.println(" "+toppings.get(i));
    }
  }
  void bake(){
    System.out.println("Baking...");
  }
  void cut(){
    System.out.println("cutting...");
  }
  void box(){
    System.out.println("boxing...");
  }
  public String getName(){
    return name;
  }
} 
  