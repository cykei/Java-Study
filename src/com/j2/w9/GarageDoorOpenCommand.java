package com.j2.w9;

public class GarageDoorOpenCommand implements Command{
  private GarageDoor garage;
  public GarageDoorOpenCommand(GarageDoor garage){
    this.garage=garage;
  }
  public void execute(){
    garage.up();
  }
}
