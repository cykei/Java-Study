package com.j2.w7;

abstract public class Pizza{
  String name;
  Dough dough;
  Cheese cheese;
  
  abstract void prepare();
  void bake(){
    System.out.println("baking...");
  }
  void cut(){
    System.out.println("cutting...");
  }
  void box(){
    System.out.println("boxing...");
  }
  void setName(String name){
    this.name=name;
  }
  String getName(){
    return name;
  }
}