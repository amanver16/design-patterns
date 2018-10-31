package com.aman.gof.drinksfactory.app.concreteimplementor;

import com.aman.gof.drinksfactory.app.implementor.Drinks;

public class SevenUp implements Drinks {

    @Override
    public String fillDrink(int quantity) {
        return quantity + "ml 7Up filled.";
    }

}