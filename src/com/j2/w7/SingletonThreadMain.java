package com.j2.w7;

public class SingletonThreadMain{
  public static void main(String []args){
    SingletonThread singleton1=SingletonThread.getInstance();//최초생성
    SingletonThread singleton2=SingletonThread.getInstance();//최초생성을 다시 데려옴
    SingletonThread singleton3=SingletonThread.getInstance();//최초생성을 다시 데려옴
  }
}
