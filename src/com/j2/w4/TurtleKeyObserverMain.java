package com.j2.w4;
import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class TurtleKeyListener extends Turtle{
  public TurtleKeyListener(){
    //TurtleKeyAdapter tka=new TurtleKeyAdapter(); //:�� ���°������� ����
    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e){
      int keyCode=e.getKeyCode();
      switch(keyCode){
        case KeyEvent.VK_UP:
          setStatusText("forward 20"); //â�ؿ� ������ �߰����ش�. ������ 20���ٴ� ����
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
          setStatusText("forward 20"); //â�ؿ� ������ �߰����ش�. ������ 20���ٴ� ����
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
    TurtleKeyListener t=new TurtleKeyListener(); //update �Ⱦ��� ���� : framework�� �̹� �� ������ �ֱ⶧�� ... ? �����ڸ� ����� ������ �޾ƿͼ� ���ư�? 
    t.addStatusBar(20);
    t.setStatusText("Press any key!");
  }
}
