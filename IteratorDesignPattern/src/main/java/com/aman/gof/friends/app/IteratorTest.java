package com.aman.gof.friends.app;

import com.aman.gof.friends.app.concreteaggregate.MyFriends;
import com.aman.gof.friends.app.iterator.Iterator;

public class IteratorTest {

    public static void main(String[] args) {

        MyFriends myFriends = new MyFriends();
        Iterator iterator = myFriends.createFriendsIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}