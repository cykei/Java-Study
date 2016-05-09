package com.j2.w9;

public class LightOffCommandUndo implements CommandUndo {
 LightUndo light;
 int level;
 public LightOffCommand(LightUndo light) {
  this.light = light;
 }
 
 public void execute() {
  level = light.getLevel();
  light.off();
 }
 
 public void undo() {
  light.dim(level);
 }
}