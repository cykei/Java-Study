package com.j2.w7;

public class SingletonV0{
  private static Singleton uniqueInstance;
  private static int numCalled=0; //���ظ� ���� ���� count�� ����� �f��. ��� �����ְ� �ϱ����� static ���� ����.
  private Singleton(){}
  public static Singleton getInstance(){//argument �ȸ���. ��ü������ ���� �ʱ� ���� static����.. �����ؾ��ϴϱ� public����..
    if(uniqueInstance==null){
      uniqueInstance=new Singleton();
    }
    numCalled++;
    System.out.println("numCalled: " +numCalled);
    return uniqueInstance;
  }
}
  