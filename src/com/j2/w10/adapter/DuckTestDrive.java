package com.j2.w10.adapter;

public class DuckTestDrive{
  public static void main(String[]args){
    WildTurkey turkey=new WildTurkey();
    TurkeyAdapter ta=new TurkeyAdapter(turkey);
    ta.quack();
    testDuck(ta);
  }
  static void testDuck(Duck duck){
    duck.quack();
  }
}