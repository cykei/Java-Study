package com.j2.w10.cmdundo;

public class RemoteControlTestV2{
  public static void main(String[]args){
    RemoteControlWithUndo remote = new  RemoteControlWithUndo();
    Light light =new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff= new LightOffCommand(light);
    
    DVD dvd = new DVD(30);
    DVDPlayCommand playDVD =new DVDPlayCommand(dvd);
    DVDStopCommand stopDVD =new DVDStopCommand(dvd);
    
    remote.setCommand(0,lightOn,lightOff);
    remote.setCommand(1,playDVD,stopDVD);
    
    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
   
    remote.onButtonWasPushed(1);
    remote.offButtonWasPushed(1);
    
  }
}