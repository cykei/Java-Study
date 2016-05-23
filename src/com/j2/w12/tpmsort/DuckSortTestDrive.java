package com.j2.w12.tpmsort;
import java.util.ArrayList;
import java.util.Arrays;

public class DuckSortTestDrive{
  public static void main(String[]args){
    Duck[] ducks={new Duck("Daffy",8),new Duck("Dewey",2),new Duck("Howard",7),new Duck("Loule",2),new Duck("Donald",10),new Duck("Huey",2)};
    
    System.out.println("Before sorting");
    Arrays.sort(ducks);
    
    Duck[] myDucks={new Duck("Sang",8),new Duck("Myung",2),new Duck("Uni",7)};
    Arrays.sort(myDucks,new DuckComparator());
  }
  }
  
