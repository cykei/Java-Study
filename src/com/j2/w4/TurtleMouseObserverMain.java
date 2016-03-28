package com.j2.w4;

import ch.aplu.turtle.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

class TurtleMouseListener extends Turtle {
  public TurtleMouseListener(){
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e){
        Point2D.Double p; //java라서 해준다. point는 객체중에서 2개를 받아와야되는데 복잡하다고 함.
        p=toTurtlePos(e.getPoint()); //거북이가 쓰는 좌표를 바꿔주는 함수
        double d=distance(p); // 거리를 받아옵니다.
        double w=towards(p); //방향의 각도를 정합니다.
        heading(w); //가는 방향을 정한다.
        forward(d); // 받아온 거리만큼 전진합니다.
        setStatusText("moving to"+p.toString());
      }
    });
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Point2D.Double p;
        p=toTurtlePos(e.getPoint()); 
        moveTo(p); //지나간 궤적을 지워주는 편리한 move함수
        setStatusText("dragging to " +p.toString());
      }
      public void mouseReleased(MouseEvent e){
	Point2D.Double r;
	r=toTurtlePos(e.getPoint());
	moveTo(r);
	setStatusText("releasing to " +p.toString());
    });
  }
}
public class TurtleMouseObserverMain{
  public static void main(String[]args){
    TurtleMouseListener t=new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("click or drag");
  }
}

       