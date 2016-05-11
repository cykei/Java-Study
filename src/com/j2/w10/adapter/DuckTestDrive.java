package com.j2.w10.adapter;

public class DuckTestDrive{
  public static void main(String[]args){
    WildTurkey turkey=new WildTurkey();
    TurkeyAdapter ta=new TurkeyAdapter(turkey);
    ta.quack();//컴파일 시점 == 런타임 시점 
    testDuck(ta);// 컴파일은 testDuck, 런타임은 ta , strategy Pattern
  }
  static void testDuck(Duck duck){
    duck.quack();
  }
}