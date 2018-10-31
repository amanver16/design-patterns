package com.aman.gof.drinksfactory.app.refinedabstraction;

import com.aman.gof.drinksfactory.app.abstraction.DrinksBottle;
import com.aman.gof.drinksfactory.app.implementor.Drinks;

public class SevenUpBottle extends DrinksBottle {

    public SevenUpBottle(Drinks drinks) {
        super(drinks);
    }

    @Override
    public void manufactureBottle(int bottleCapacity) {
        System.out.println("7Up bottle manufactured.");
        System.out.println(drinks.fillDrink(bottleCapacity));
    }

}