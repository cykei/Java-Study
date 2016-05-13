package com.j2.w11.smarthome;

public class SmartHomeTestDrive{
  public static void main(String[]args){
    Light light =new Light();
    Desktop desktop=new Desktop();
    Laptop laptop=new Laptop();
    Amplifier amp=new Amplifier();
    
    SmartHomeFacade shf=new SmartHomeFacade(light,desktop,laptop,amp);
    shf.beginStudy();
    shf.endStudy();
  }
}