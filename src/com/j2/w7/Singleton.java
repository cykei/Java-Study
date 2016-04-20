package com.j2.w7;

public class Singleton{ //thread 巩力 秦搬 规过 1 (early 规过 盲琶. in 按眉积己)
  private static Singleton uniqueInstance=new Singleton();
  private static int numCalled=0; 
  private Singleton(){}
  public static Singleton getInstance(){
    //if(uniqueInstance==null){
   // uniqueInstance=new Singleton();
    //}
    numCalled++;
    System.out.println("numCalled: " +numCalled);
    return uniqueInstance;
  }
}
  