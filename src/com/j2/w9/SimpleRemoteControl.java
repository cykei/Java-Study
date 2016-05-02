package com.j2.w9;

public class SimpleRemoteControl{
  Command slot;
  public void setCommand(Command slot){
    this.slot=slot;
  }
  public void buttonPressed(){
    slot.execute();
  }
}
