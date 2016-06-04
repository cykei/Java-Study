package com.j2.w14.state.new_case;

public class OverVideoState implements State{
  VideoPlayer videoPlayer;
  
  public OverVideoState(VideoPlayer videoPlayer) {
    this.videoPlayer = videoPlayer;
  }
  
  public void play(){
    System.out.println("Start the movie");
    videoPlayer.setState(videoPlayer.getRunningVideoState());
  }
  public void pause(){
    System.out.println("You can't order pause before ordering play video");
  }   
  public void sleepDisplay(){
    System.out.println("The display turned into sleep mode");
    videoPlayer.setState(videoPlayer.getDisplaySleepState());
  }
}