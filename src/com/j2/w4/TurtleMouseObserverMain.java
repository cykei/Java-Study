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
        Point2D.Double p; //java�� ���ش�. point�� ��ü�߿��� 2���� �޾ƿ;ߵǴµ� �����ϴٰ� ��.
        p=toTurtlePos(e.getPoint()); //�ź��̰� ���� ��ǥ�� �ٲ��ִ� �Լ�
        double d=distance(p); // �Ÿ��� �޾ƿɴϴ�.
        double w=towards(p); //������ ������ ���մϴ�.
        heading(w); //���� ������ ���Ѵ�.
        forward(d); // �޾ƿ� �Ÿ���ŭ �����մϴ�.
        setStatusText("moving to"+p.toString());
      }
    });
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Point2D.Double p;
        p=toTurtlePos(e.getPoint()); 
        moveTo(p); //������ ������ �����ִ� ���� move�Լ�
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

       