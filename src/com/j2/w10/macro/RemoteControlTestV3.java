package com.j2.w10.macro;
import com.j2.w10.cmdundo.*;
public class RemoteControlTestV3{
  public static void main(String[]args){
    RemoteControlWithUndo remote = new  RemoteControlWithUndo();
    Light light =new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff= new LightOffCommand(light);
    
    DVD dvd = new DVD(30);
    DVDPlayCommand playDVD =new DVDPlayCommand(dvd);
    DVDStopCommand stopDVD =new DVDStopCommand(dvd);
   
    Command[] macroOn={lightOn,playDVD};
    Command[] macroOff={lightOff,stopDVD};
    
    MacroCommand on=new MacroCommand(macroOn);
    MacroCommand off=new MacroCommand(macroOff);
    
    remote.setCommand(0, on, off);
    
    System.out.println("--pushing Macro on--");
    remote.onButtonWasPushed(0);
    
    System.out.println("--pushing Macro off--");
    remote.offButtonWasPushed(0);
    
  }
}