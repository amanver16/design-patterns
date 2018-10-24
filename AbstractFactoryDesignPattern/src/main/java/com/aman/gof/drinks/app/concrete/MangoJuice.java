package com.aman.gof.drinks.app.concrete;

import com.aman.gof.drinks.app.drinksinterface.Drinks;

public class MangoJuice implements Drinks {

    @Override
    public void prepareDrink() {
        System.out.println("Mango Juice Prepared :)");
    }

}