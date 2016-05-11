package com.j2.w11;

public class DvdPlayer{
  String movie;
  
  public void on(){
    System.out.println("dvd player on");
  }
  public void off(){
    System.out.println("dvd player off");
  }
  public void eject(){
    movie=null;
    System.out.println("dvd player eject");
  }
  public void play(String movie){
    this.movie=movie;
    System.out.println("playing "+movie);
  }
  public void stop(){
    System.out.println("stopped "+movie);
  }
}
