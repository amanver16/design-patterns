package com.aman.gof.drinks.app.abstractfactory;

import com.aman.gof.drinks.app.drinksinterface.Drinks;

public abstract class DrinksAbstractFactory {

    public abstract Drinks getDrink(String drinkName);

}