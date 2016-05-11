package com.j2.w10.adapter;

public class DuckTestDrive{
  public static void main(String[]args){
    WildTurkey turkey=new WildTurkey();
    TurkeyAdapter ta=new TurkeyAdapter(turkey);
    ta.quack();//������ ���� == ��Ÿ�� ���� 
    testDuck(ta);// �������� testDuck, ��Ÿ���� ta , strategy Pattern
  }
  static void testDuck(Duck duck){
    duck.quack();
  }
}