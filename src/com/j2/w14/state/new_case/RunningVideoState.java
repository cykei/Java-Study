package com.j2.w14.state.new_case;

public class RunningVideoState implements State{
  VideoPlayer videoPlayer;
  
  public RunningVideoState(VideoPlayer videoPlayer) {
    this.videoPlayer = videoPlayer;
  }
  
  public void play(){
    System.out.println("Already running.");
  }
  public void pause(){
    System.out.println("pause..");
    videoPlayer.setState(videoPlayer.getPauseVideoState());
  }
  public void sleepDisplay(){
    System.out.println("The display don't turn into sleep mode");
  }
}