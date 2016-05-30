package com.j2.w13.state.before;

//state pattern 안쓰는 버전

public class GumballMachineTestDrive{
  public static void main(String[]args){
    GumballMachine gm=new GumballMachine(5);
    gm.insertQuarter();
    gm.insertQuarter();
    gm.turnCrank();
  }
}
