package com.aman.gof.drinks.app.factory;

import com.aman.gof.drinks.app.abstractfactory.DrinksAbstractFactory;
import com.aman.gof.drinks.app.concrete.Coffee;
import com.aman.gof.drinks.app.concrete.MangoJuice;
import com.aman.gof.drinks.app.concrete.MilkShake;
import com.aman.gof.drinks.app.concrete.Tea;
import com.aman.gof.drinks.app.drinksinterface.Drinks;

public class DrinksFactory extends DrinksAbstractFactory {

    @Override
    public Drinks getDrink(String drinkName) {

        if (drinkName == null) {
            return null;
        }

        if ("Tea".equalsIgnoreCase(drinkName)) {
            return new Tea();
        }

        if ("Coffee".equalsIgnoreCase(drinkName)) {
            return new Coffee();
        }

        if ("MilkShake".equalsIgnoreCase(drinkName)) {
            return new MilkShake();
        }

        if ("MangoJuice".equalsIgnoreCase(drinkName)) {
            return new MangoJuice();
        }

        return null;
    }

}