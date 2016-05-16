package com.j2.w11.beforetemplate;

public class Coffee{
  void prepareRecipe(){//절차를 묶고 있다. template 패턴적용전의 모습. 
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  public void boilWater(){
    System.out.println("Boiling water");
  }
  public void pourInCup(){
    System.out.println("pouring in cup");
  }
  public void brewCoffeeGrinds(){
    System.out.println("brewing coffee grinds");
  }
  public void addSugarAndMilk(){
    System.out.println("add sugar and milk");
  }
}


  
  