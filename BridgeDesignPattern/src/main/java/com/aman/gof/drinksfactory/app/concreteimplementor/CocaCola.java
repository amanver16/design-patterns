package com.aman.gof.drinksfactory.app.concreteimplementor;

import com.aman.gof.drinksfactory.app.implementor.Drinks;

/**
 * This is concrete implementor class which implements the implementor interface
 */
public class CocaCola implements Drinks {

    @Override
    public String fillDrink(int quantity) {
        return quantity + "ml Coca Cola filled.";
    }

}