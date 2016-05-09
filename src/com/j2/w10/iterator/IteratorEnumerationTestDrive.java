package com.j2.w10.iterator;

import java.util.*;

public class IteratorEnumerationTestDrive{
  public static void main(String[]args){
    ArrayList l = new ArrayList();
    Enumeration enumeration = new IteratorEnumeration(l.iterator());
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
  }
}