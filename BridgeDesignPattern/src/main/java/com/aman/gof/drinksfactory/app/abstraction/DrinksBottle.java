package com.aman.gof.drinksfactory.app.abstraction;

import com.aman.gof.drinksfactory.app.implementor.Drinks;

/**
 * The abstraction defines an absract class which has reference to implementor
 * interface Drinks. It contains one abstract method to manufacture bottle which
 * is implemented by its subclasses(refined abstraction). The client only refers
 * to this abstract class to perform an operation and does not worry about
 * implementor interface. It can be either an interface or abstract class
 */
public abstract class DrinksBottle {

    protected Drinks drinks;

    protected DrinksBottle(Drinks drinks) {
        this.drinks = drinks;
    }

    public abstract void manufactureBottle(int bottleCapacity);

}