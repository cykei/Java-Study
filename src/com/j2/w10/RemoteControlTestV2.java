package com.j2.w10;

public class RemoteControlTestV2{
  public static void main(String[]args){
    RemoteControlWithUndo remote = new  RemoteControlWithUndo();
    LightUndo light =new LightUndo();
    LightOnCommandUndo lightOn = new LightOnCommandUndo(light);
    LightOffCommandUndo offCommand= new LightOffCommandUndo(light);
    remote.setCommand(0,lightOn,offCommand);
    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
  }
}