package com.j2.w7;

public class SingletonMain{
  public static void main(String []args){
    Singleton singleton1=Singleton.getInstance();//���ʻ���
    Singleton singleton2=Singleton.getInstance();//���ʻ����� �ٽ� ������
    Singleton singleton3=Singleton.getInstance();//���ʻ����� �ٽ� ������
  }
}
