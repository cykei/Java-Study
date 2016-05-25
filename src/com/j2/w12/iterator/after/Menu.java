package com.j2.w12.iterator.after;

public interface Menu{
  public Iterator createIterator(); //factory pattern (factory method). instance를 만들어서 돌려주는건데 무슨 instance가 돌아오는거에요? -Iterator요 (DinerMenuIterator).
}
