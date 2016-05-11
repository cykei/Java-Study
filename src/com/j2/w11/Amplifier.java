package com.j2.w11;

public class Amplifier{
  DvdPlayer dvd;
  public void on(){
    System.out.println("amplifier on");
  }
  public void off(){
    System.out.println("amplifier off");
  }
  public void setDvd(DvdPlayer dvd){
    System.out.println("setting DVD player to "+ dvd);
    this.dvd=dvd;
  }
  public void setVolume(int level){
    System.out.println("setting volume to" +level);
  }
  
}
    