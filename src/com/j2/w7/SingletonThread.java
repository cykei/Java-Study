package com.j2.w7;

public class SingletonThread{ //thread문제해결방식 2 . (thread 방식)
  private static SingletonThread uniqueInstance;
  private static int numCalled=0; 
  private SingletonThread(){}
  public static synchronized SingletonThread getInstance(){
    if(uniqueInstance==null){
      uniqueInstance=new SingletonThread();
    }
    numCalled++;
    System.out.println("numCalled: " +numCalled);
    return uniqueInstance;
  }
}
  