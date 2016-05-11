package com.j2.w11;

public class HomeTheaterTestDrive{
  public static void main(String[]args){
    Amplifier amp = new Amplifier();
    Tuner tuner = new Tuner();
    DvdPlayer dvd = new DvdPlayer();
    Projector projector = new Projector();
    
    HTFacade ht=new HTFacade(amp,tuner,dvd,projector);
    ht.watchMovie("civil war");
    ht.endMovie();
  }
}