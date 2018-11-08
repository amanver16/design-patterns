package com.aman.gof.friends.app.concreteaggregate;

import com.aman.gof.friends.app.aggregate.Friends;
import com.aman.gof.friends.app.concreteiterator.MyIterator;
import com.aman.gof.friends.app.iterator.Iterator;

/**
 * This class represents concrete aggregate which implements aggregate to return
 * the proper concrete iterator object
 */
public class MyFriends implements Friends {

    private String[] myFriends = { "Upendra", "Vivek", "Vishal", "Pradeep", "Bikram", "Gaurab", "Ravi", "Arun" };

    @Override
    public Iterator createFriendsIterator() {
        return new MyIterator(myFriends);
    }

}