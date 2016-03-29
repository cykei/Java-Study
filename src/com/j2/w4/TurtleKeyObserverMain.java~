package com.j2.w4;
import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class TurtleKeyListener extends Turtle{
  public TurtleKeyListener(){
    //TurtleKeyAdapter tka=new TurtleKeyAdapter(); //:를 쓰는것일지도 몰라
    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e){
      int keyCode=e.getKeyCode();
      switch(keyCode){
        case KeyEvent.VK_UP:
          setStatusText("forward 20"); //창밑에 도움말이 뜨게해준다. 앞으로 20갔다는 도움말
          forward(20);
          break;    
        case KeyEvent.VK_DOWN:
          setStatusText("back20");
          back(20);
          break;
        case KeyEvent.VK_LEFT: 
          setStatusText("turn left"); 
          left(90); 
          break; 
        case KeyEvent.VK_RIGHT : 
          setStatusText("turn right"); 
          right(90); 
          break; 

        case KeyEvent.VK_Q:
          setStatusText("q pressed and exiting");
          break;

        case KeyEvent.VK_W:
          setStatusText("forward 20"); //창밑에 도움말이 뜨게해준다. 앞으로 20갔다는 도움말
          forward(20);
          break;    
        case KeyEvent.VK_S:
          setStatusText("back20");
          back(20);
          break;
        case KeyEvent.VK_A: 
          setStatusText("turn left"); 
          left(90); 
          break; 
        case KeyEvent.VK_D : 
          setStatusText("turn right"); 
          right(90); 
          break; 
      }
      }
    });
  }
}

public class TurtleKeyObserverMain{
  public static void main(String [] args){
    TurtleKeyListener t=new TurtleKeyListener(); //update 안쓰는 이유 : framework에 이미 다 내제되 있기때문 ... ? 생성자를 만들면 저절로 받아와서 돌아감? 
    t.addStatusBar(20);
    t.setStatusText("Press any key!");
  }
}
