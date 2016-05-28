package com.j2.w12.iterator.after;

public class Waitress{ //이게 main함수 같은 녀석임. 
  PancakeHouseMenu phm;
  DinerMenu dm;
  
  public Waitress(PancakeHouseMenu p, DinerMenu d){
    phm=p;
    dm=d;
  }
  public void printMenu(){
     Iterator pi = phm.createIterator();
     printMenu(pi);
     Iterator di = dm.createIterator();
     printMenu(di);
  }
  public void printMenu(Iterator iterator) {
      
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName()+",");
        }
    }
  //public static void main(String[]args){
    //printMenu();
 // }
}