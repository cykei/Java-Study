package com.j2.w10.iterator;

import java.util.*;
public class IteratorEnumeration implements Enumeration{
  Iterator it;
  public IteratorEnumeration(Iterator it){
    this.it=it;
  }
  public boolean hasMoreElements(){
    return it.hasNext();
  }
  public Object nextElement(){
    return it.next();
  }
}
