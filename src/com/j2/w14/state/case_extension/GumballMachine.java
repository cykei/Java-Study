package com.j2.w14.state.case_extension;
// 고장 상태 추가 
public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State outOfOrderState;
  
  State state = soldOutState;
  int count = 0;
  
  public GumballMachine(int count) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    outOfOrderState = new OutOfOrderState(this);
    
    this.count = count;
    if (count > 0) {
      state = noQuarterState;
    } 
  }
  
  public void insertQuarter() {
    state.insertQuarter();
  }
  
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }
  
  int getCount() {
    return count;
  }
  
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  
  void setState(State state) {
    this.state = state;
  }    
  
  public State getState() {
    return state;
  }
  public State getOutOfOrderState(){
    return outOfOrderState;
  }
  public State getSoldOutState() {
    return soldOutState;
  }
  
  public State getNoQuarterState() {
    return noQuarterState;
  }
  
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  
  public State getSoldState() {
    return soldState;
  }
}