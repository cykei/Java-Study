package com.j2.w10.cmdundo;

public class DVDPlayCommand implements Command{
  DVD dvd;
  int track;
  public DVDPlayCommand(DVD d){
    dvd=d;
  }
  public void execute(){
    dvd.play();
    track=dvd.getTrack();
  }
  public void undo(){
   dvd.stop();
  }
}