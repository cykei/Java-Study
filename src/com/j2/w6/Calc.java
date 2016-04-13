package com.j2.w6;

import java.util.Scanner;

public class Calc{
  
  public static void main(String []args){
    System.out.println("IF YOU WANT TO PROGRAM TO FINISH, PRESS CTRL+Z.");
    Scanner scan=new Scanner(System.in);
    System.out.println("PRESS A NUMBER");
    while(scan.hasNext()){
      double num1=scan.nextDouble();
      System.out.println("PRESS ONE OF THE FOUR FUNDAMENTAL ARITHMETIC OPERATIONS");
      String str=scan.next();
      char op=str.charAt(0);
      System.out.println("PRESS A NUMBER");
      double num2=scan.nextDouble();
      double temp=0;
    switch(op)
    {
      case'+':
        temp=num1+num2;
        break; 
      case'-':
        temp=num1-num2;
        break;
      case'*':
        temp=num1*num2;
        break;
      case'/':
        temp=num1/num2;
        break;
      default:
        System.out.println("YOU HAVE A MISTAKE IN PRESSING YOUR ARITMETIC OPERATIONS"); 
    }
    System.out.println();
    System.out.println(num1+str+num2+"="+temp);
    System.out.println();
    System.out.println("PRESS A NUMBER");
    }
  }
}    
 