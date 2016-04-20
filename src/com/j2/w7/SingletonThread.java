package com.j2.w7;

public class SingletonThread{ //thread�����ذ��� 2 . (thread ���)
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
  