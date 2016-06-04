package com.j2.w14.state.case_extension;
// 고장 상태 추가 

public interface State {
 public void insertQuarter();
 public void ejectQuarter();
 public void turnCrank();
 public void dispense();
}