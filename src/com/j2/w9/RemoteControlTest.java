package com.j2.w9;

public class RemoteControlTest{
  public static void main(String []args){
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOn=new LightOnCommand(light);
    remote.setCommand(lightOn);
    remote.buttonPressed();
  }
}

    
class Light{
  public Light() {}
  public void on(){
    System.out.println("light is on");
  }
  public void off(){
    System.out.println("light is off");
  }
}

class GarageDoor{
  public void up(){
    System.out.println("garage door up");
  }
  public void down(){
    System.out.println("garage door down");
  }
}

interface Command{
  public void execute();
}

class LightOnCommand implements Command{
  private Light light;
  public LightOnCommand(Light light){
    this.light=light;
  }
  public void execute(){
    light.on();
  }
}

class GarageDoorOpenCommand implements Command{
  private GarageDoor garage;
  public GarageDoorOpenCommand(GarageDoor garage){
    this.garage=garage;
  }
  public void execute(){
    garage.up();
  }
}

class SimpleRemoteControl{
  Command slot;
  public void setCommand(Command slot){
    this.slot=slot;
  }
  public void buttonPressed(){
    slot.execute();
  }
}

