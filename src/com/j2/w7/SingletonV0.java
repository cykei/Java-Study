package com.j2.w7;

public class SingletonV0{
  private static Singleton uniqueInstance;
  private static int numCalled=0; //이해를 돕기 위해 count를 만들어 봣다. 계속 남아있게 하기위해 static 으로 선언.
  private Singleton(){}
  public static Singleton getInstance(){//argument 안만듬. 객체생성을 하지 않기 위해 static으로.. 공유해야하니까 public으로..
    if(uniqueInstance==null){
      uniqueInstance=new Singleton();
    }
    numCalled++;
    System.out.println("numCalled: " +numCalled);
    return uniqueInstance;
  }
}
  