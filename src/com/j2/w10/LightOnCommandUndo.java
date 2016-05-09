package com.j2.w10;

public class LightOnCommandUndo implements CommandUndo{
  private LightUndo light;
  int level;
  public LightOnCommandUndo(LightUndo light){
    this.light=light;
  }
  public void execute(){
    light.on();
  }
  public void undo(){
    light.dim(level);
  }
}