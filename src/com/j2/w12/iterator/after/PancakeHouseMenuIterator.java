package com.j2.w12.iterator.after;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;
    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }
    public Object next() {
        Object object = items.get(position);// upcasting이기대문에 items앞에 (Object)를 안붙여도 된다. 자동으로 됨.
        position = position + 1;
        return object;
    }
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}