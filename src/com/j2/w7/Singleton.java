package com.j2.w7;

public class Singleton{ //thread ���� �ذ� ��� 1 (early ��� ä��. in ��ü����)
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
  