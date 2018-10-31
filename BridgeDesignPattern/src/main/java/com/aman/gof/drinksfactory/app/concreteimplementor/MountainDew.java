package com.aman.gof.drinksfactory.app.concreteimplementor;

import com.aman.gof.drinksfactory.app.implementor.Drinks;

public class MountainDew implements Drinks {

    @Override
    public String fillDrink(int quantity) {
        return quantity + "ml Mountain Dew filled.";
    }

}