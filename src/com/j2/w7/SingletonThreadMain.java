package com.j2.w7;

public class SingletonThreadMain{
  public static void main(String []args){
    SingletonThread singleton1=SingletonThread.getInstance();//���ʻ���
    SingletonThread singleton2=SingletonThread.getInstance();//���ʻ����� �ٽ� ������
    SingletonThread singleton3=SingletonThread.getInstance();//���ʻ����� �ٽ� ������
  }
}
