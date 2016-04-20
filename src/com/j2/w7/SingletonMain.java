package com.j2.w7;

public class SingletonMain{
  public static void main(String []args){
    Singleton singleton1=Singleton.getInstance();//최초생성
    Singleton singleton2=Singleton.getInstance();//최초생성을 다시 데려옴
    Singleton singleton3=Singleton.getInstance();//최초생성을 다시 데려옴
  }
}
