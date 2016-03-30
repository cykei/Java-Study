package com.j2.w5;

abstract class Beverage{//abstract�� �ϴ� ���� : decorator���� ��� ������ �ϱ����ؼ��� abtract(supper class)�� �ִ� �Լ����� �� �� �ֽ��ϴ�. �׷��� decorator���� �������ؼ� ���ݴϴ�. 
  String description="Unknown beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost(); //cost�� ����Ŭ���� ���� ��� �޶����⶧���� �ϴ� ���Դϴ�.
}
class Espresso extends Beverage{
  public Espresso(){
    description="Espresso";//Beverage�� "Unknown beverage"��� ���� ������� ������ ���� �� �ڸ��� ����մϴ�.
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

  public abstract String getDescription(); //superclass�� getDescription�� ����. child class�� ���� �̿��ؾ� �ϱ⶧��.(��, �׻� �̷��� �ϴ� ���� �ƴմϴ�.)
}

class Mocha extends CondimentDecorator{
  Beverage beverage;
  public Mocha(Beverage b) {//�� �ȿ� �� �ִ�! (�����ھȿ� superclass �����ڸ� �ֽ��ϴ�.=decorator����)  
    beverage=b; //object�� class�� ���������� ���� �ϰ� �ϱ����ؼ� b�� �ִ´�. ����: memory������ ��ȿ�����̴�. ������ ������ decorator�� �̿��Ұ��̱⿡ �̷��� �Ѵ�.     
  }
  public String getDescription() {
    return beverage.getDescription()+".Mocha"; //������ �߰��Ͽ� decorating�� �Ϸ��߽��ϴ�.
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
    Beverage b=new DarkRoast(); //Mocha(Beverage b)�� superclass�� ��Ƴ��⶧���� downcasting�� �ؼ� �Ѱܹ޾ƾ��ϴµ� ����ڷ� �ؼ� �Ѱܹ޽��ϴ�.
    Beverage md = new Mocha(b); //mocha+dark
    Beverage wmd=new Whip(md);   //whip+mocha+dark
    //Beverage wmd=new Whip(new Mocha(new DarkRost())); ->���ȿ� �� �ִ�!
    //Whip(m)
    System.out.println(wmd.getDescription());
    System.out.println(wmd.cost());
}
}//�� Ŀ��.