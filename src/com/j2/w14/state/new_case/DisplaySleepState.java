package com.j2.w14.state.new_case;

public class DisplaySleepState implements State{
  VideoPlayer videoPlayer;
  
  public DisplaySleepState(VideoPlayer videoPlayer) {
    this.videoPlayer = videoPlayer;
  }
  
  public void play(){
    System.out.println("Display on");
    videoPlayer.setState(videoPlayer.getDisplayOnState());    
  }
  public void pause(){
    System.out.println("Display on");
    videoPlayer.setState(videoPlayer.getDisplayOnState());  
  }
  public void sleepDisplay(){
    System.out.println();
  }
}