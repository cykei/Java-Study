package com.j2.w11.smarthome;

public class Desktop{
  
  Amplifier amp;
  
  public void on(){
    System.out.println("desktop on----");
  }
  public void off(){
    System.out.println("desktop off");
  }
  public void connectAmp(Amplifier amp){
    this.amp=amp;
    System.out.println("connecting with amplifier....");
  }
  public void runMusicApp(){
    System.out.println("to run music app");
  }
  public void endMusicApp(){
    System.out.println("to end music app");
  }
  public void startMusic(){
    System.out.println("music start----");
  }
  public void stopMusic(){
    System.out.println("stop the music");
  }
}
