package com.j2.w12.tpmsort;

import java.util.Comparator;

public class DuckComparator implements Comparator{
  public int compare(Object o1, Object o2){
    Duck duck1=(Duck)o1;
    Duck duck2=(Duck)o2;
    return duck1.weight-duck2.weight;
  }
}