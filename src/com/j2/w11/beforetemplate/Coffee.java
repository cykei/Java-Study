package com.j2.w11.beforetemplate;

public class Coffee{
  void prepareRecipe(){//������ ���� �ִ�. template ������������ ���. 
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


  
  