package com.j2.w10.adapter;

public class TurkeyAdapter implements Duck{
  Turkey turkey;
  public TurkeyAdapter(Turkey turkey){//decorator 패턴과 유사. 다른점: 상속이 아님. 
    this.turkey=turkey;
  }
  public void quack(){
    turkey.gobble();
  }
  public void fly(){
    turkey.fly();
  }
}

  
  