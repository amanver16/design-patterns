package com.aman.gof.friends.app.concreteiterator;

import com.aman.gof.friends.app.iterator.Iterator;

/**
 * This class represents concrete iterator which implements the iterator
 * interface to perform iterating operations on the collection
 */
public class MyIterator implements Iterator {

    private String[] array;
    private int index = 0;

    public MyIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (index < array.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return array[index++];
        }
        return null;
    }

}