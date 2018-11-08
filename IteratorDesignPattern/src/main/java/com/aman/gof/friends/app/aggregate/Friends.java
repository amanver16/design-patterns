package com.aman.gof.friends.app.aggregate;

import com.aman.gof.friends.app.iterator.Iterator;

/**
 * This interface represents aggregate which declares a method to create the
 * iterator object
 */
public interface Friends {

    public Iterator createFriendsIterator();

}