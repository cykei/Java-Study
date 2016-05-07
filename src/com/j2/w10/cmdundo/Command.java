package com.j2.w10.cmdundo;

public interface Command{
  public void execute();
  public void undo();
}