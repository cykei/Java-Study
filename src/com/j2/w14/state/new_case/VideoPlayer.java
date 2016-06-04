package com.j2.w14.state.new_case;

public class VideoPlayer{
  State displayOnState;
  State displaySleepState;
  State runningVideoState;
  State pauseVideoState;
  State overVideoState;
  
  State state = displaySleepState;
  
  public VideoPlayer() {
     displayOnState = new DisplayOnState(this);
     runningVideoState = new RunningVideoState(this);
     pauseVideoState = new PauseVideoState(this);
     displaySleepState = new DisplaySleepState(this);
     overVideoState = new OverVideoState(this);
     
     state = displayOnState;
  } 
  
  
  void setState(State state) {
    this.state = state;
  }    
  public State getState() {
    return state;
  }
  
  public void play(){
    state.play();
  }
  public void pause(){
    state.pause();
    state.sleepDisplay();
  }
  public void sleepDisplay(){
    state.sleepDisplay();
  }
  
  public State getDisplayOnState(){
    return displayOnState;
  }
  public State getDisplaySleepState(){
    return displaySleepState;
  }
  public State getRunningVideoState() {
    return runningVideoState;
  }
  public State getPauseVideoState() {
    return pauseVideoState;
  }
  public State getOverVideoState() {
    return overVideoState;
  }
}
  