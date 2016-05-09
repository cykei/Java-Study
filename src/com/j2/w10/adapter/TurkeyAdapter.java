package com.j2.w10.adapter;

public class TurkeyAdapter implements Duck{
  Turkey turkey;
  public TurkeyAdapter(Turkey turkey){//decorator ���ϰ� ����. �ٸ���: ����� �ƴ�. 
    this.turkey=turkey;
  }
  public void quack(){
    turkey.gobble();
  }
  public void fly(){
    turkey.fly();
  }
}

  
  