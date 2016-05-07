package com.j2.w10.cmdundo;

public class DVDStopCommand implements Command{
  DVD dvd;
  int track;
  public DVDStopCommand(DVD dvd){
    this.dvd=dvd;
  }
  public void execute(){
    dvd.stop();
    track=dvd.getTrack();
  }
  public void undo(){
    dvd.play();
  }
}