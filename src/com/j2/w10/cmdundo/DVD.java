package com.j2.w10.cmdundo;

public class DVD{
  int track;
  int totalTrackNumber;
  public void setTrack(int track){
    this.track=track;
    if (track>totalTrackNumber){
      System.out.println("your order can not accepted");
      stop();
    } else {
    System.out.println("Track is now "+track);
  }
  }
  public int getTrack(){
    return track;
  }
  public DVD(int totalTrackNumber) {
    this.totalTrackNumber=totalTrackNumber;
  }
  public void play(){
    track=1;
    System.out.println("dvd is playing");
  }
  public void stop(){
    track=totalTrackNumber+1;
    System.out.println("dvd stopped");
  }
}
