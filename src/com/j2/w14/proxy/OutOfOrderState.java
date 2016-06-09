package com.j2.w14.proxy;


public class OutOfOrderState implements State{
  GumballMachine gumballMachine;
  
  public OutOfOrderState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter(){
    System.out.println("You inserted a quarter");
  }
  public void ejectQuarter(){
    System.out.println("I eat your quarter. sorry");
  }
  public void turnCrank(){
    System.out.println("You turned...");
  }
  public void dispense(){
    System.out.println("I eat your quarter. sorry");
  }
}