package com.j2.w6;

import java.util.ArrayList;

public abstract class PizzaV2{ //abstract를 쓰는건 책에서 그렇게 하니깐. 딱히 꼭 필요한 건 아니다.
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
  