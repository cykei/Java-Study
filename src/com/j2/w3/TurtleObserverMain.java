package com.j2.w3;
import ch.aplu.turtle.*;
import java.util.Observer;
import java.util.Observable;

public class TurtleObserverMain {
  public static void main(String [] args){
    BabyTurtle baby=new BabyTurtle();
    MomTurtle mom=new MomTurtle();
    baby.addObserver(mom); //엄마한테 등록.
    mom.moveTo(100,100); //Turtle 안에 moveTo 존재
    baby.move(100,-100); // 아까 만들었음.
    baby.setChanged(); //move 했다고 다시 등록해줌.
    baby.notifyObservers(); // 엄마한테 알려줌.
  }
}
class MomTurtle extends Turtle implements Observer{
  Double babyCurpos;
  public void update(Observable o,Object arg) {
    System.out.println("update() called,count is"+((Integer)arg).intValue());
    babyCurpos=((BabyTurtle)o).myCurpos; //Observable에 myCurpos 가 없으니까 다운캐스팅
    System.out.println("current pos" + babyCurpos);
    moveTo(babyCurpos);    
  }
}

class BabyTurtle extends Observable {
  Turtle baby; // 1번이상 쓰기때문에 필드로 잡아놨다.
  Double myCurpos;
  ArrayList<Observer> obs;
  public BabyTurtle() {
    baby=new Turtle();
    myCurpos=baby.getPos();
    obs=new ArrayList<Observer>();
  }
  public void addObserver(Observer o){
    obs.add(o);
  }
  protected void setChanged(){
  myCurpos=baby.getPos();
  }
  public void notifyObservers(){
    for(Observer o:obs)
      o.update(this, 1); //this 는 ovservable을 넘겨준다.
  }
  public void move(int x,int y){ //move를 써주는 이유는 Turtle을 상속받지 못하기때문.
    baby.moveTo(x,y);
  }
}