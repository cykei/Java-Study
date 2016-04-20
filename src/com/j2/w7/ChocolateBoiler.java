package com.j2.w7;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueinstance;
  
  private ChocolateBoiler(){
    empty=true;
    boiled=false;
  }
  public static ChocolateBoiler getInstance(){
    if (uniqueinstance==null){
      uniqueinstance=new ChocolateBoiler();
    }
    return uniqueinstance;
  }
  public void fill(){
    if(empty){
      empty=false;
      boiled=false;
    }
  }
}