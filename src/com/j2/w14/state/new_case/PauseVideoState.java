package com.j2.w14.state.new_case;

public class PauseVideoState implements State{
  VideoPlayer videoPlayer;
  
  public PauseVideoState(VideoPlayer videoPlayer) {
    this.videoPlayer = videoPlayer;
  }
  
  public void play(){
    System.out.println("Start the movie");
  }
  public void pause(){
    System.out.println("Already pause..");
  }
  public void sleepDisplay(){
    System.out.println("The display turned into sleep mode");
    videoPlayer.setState(videoPlayer.getDisplaySleepState());
  }
}