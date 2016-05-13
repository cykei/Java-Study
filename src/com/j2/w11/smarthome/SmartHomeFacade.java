package com.j2.w11.smarthome;

public class SmartHomeFacade{
    private Light light;
    private Desktop desktop;
    private Laptop laptop;
    private Amplifier amp;
  public SmartHomeFacade(Light light, Desktop desktop,Laptop laptop,Amplifier amp){
    this.light=light;
    this.desktop=desktop;
    this.laptop=laptop;
    this.amp=amp;
  }
  
  public void beginStudy(){
    System.out.println("Get ready to begin study...");
    light.on();
    desktop.on();
    amp.on();
    desktop.connectAmp(amp);
    desktop.runMusicApp();
    desktop.startMusic();
    laptop.on();
  }
  
  public void endStudy(){
    System.out.println("end Study...");
    light.off();
    desktop.stopMusic();
    desktop.endMusicApp();
    desktop.off();
    amp.off();
    laptop.off();
  }
}
