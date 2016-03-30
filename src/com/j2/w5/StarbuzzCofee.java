package com.j2.w5;

abstract class Beverage{//abstract로 하는 이유 : decorator에서 기능 구현을 하기위해서는 abtract(supper class)에 있는 함수만을 쓸 수 있습니다. 그래서 decorator에서 재정의해서 써줍니다. 
  String description="Unknown beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost(); //cost는 하위클래스 마다 계속 달라지기때문에 일단 죽입니다.
}
class Espresso extends Beverage{
  public Espresso(){
    description="Espresso";//Beverage의 "Unknown beverage"라는 글이 사라지고 좌측의 글이 그 자리를 대신합니다.
  }
  public double cost(){
    return 1.99;
  }
}
class DarkRoast extends Beverage{
  public DarkRoast(){
    description="Dark Roast Coffee";
  }
  public double cost(){
    return .99;
  }
}
abstract class CondimentDecorator extends Beverage {

  public abstract String getDescription(); //superclass의 getDescription을 죽임. child class의 것을 이용해야 하기때문.(단, 항상 이래야 하는 것은 아닙니다.)
}

class Mocha extends CondimentDecorator{
  Beverage beverage;
  public Mocha(Beverage b) {//내 안에 너 있다! (생성자안에 superclass 생성자를 넣습니다.=decorator패턴)  
    beverage=b; //object와 class의 생성시점을 같이 하게 하기위해서 b를 넣는다. 단점: memory사용률이 비효율적이다. 하지만 지금은 decorator를 이용할것이기에 이렇게 한다.     
  }
  public String getDescription() {
    return beverage.getDescription()+".Mocha"; //설명을 추가하여 decorating을 완료했습니다.
  }
  public double cost(){
    return beverage.cost() +.20;
  }
}
class Whip extends CondimentDecorator{
  Beverage beverage;
  public Whip(Beverage b){
    beverage=b;
  }
  public String getDescription(){
    return beverage.getDescription()+".Whip";
  }
  public double cost(){
    return beverage.cost()+.10;
  }
}

public class StarbuzzCofee{
  public static void main(String []args){
    Beverage b=new DarkRoast(); //Mocha(Beverage b)로 superclass를 잡아놨기때문에 downcasting을 해서 넘겨받아야하는데 요로코롬 해서 넘겨받습니다.
    Beverage md = new Mocha(b); //mocha+dark
    Beverage wmd=new Whip(md);   //whip+mocha+dark
    //Beverage wmd=new Whip(new Mocha(new DarkRost())); ->내안에 너 있다!
    //Whip(m)
    System.out.println(wmd.getDescription());
    System.out.println(wmd.cost());
}
}//재 커밋.