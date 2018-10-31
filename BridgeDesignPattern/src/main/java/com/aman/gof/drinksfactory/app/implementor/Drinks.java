package com.aman.gof.drinksfactory.app.implementor;

/**
 * The implementor interface contains methods to be implemented by the concrete
 * classes. The abstraction part (DrinksBottle) holds a reference of this interface to perform
 * operations
 */
public interface Drinks {

    public String fillDrink(int quantity);

}