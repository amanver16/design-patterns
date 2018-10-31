package com.aman.gof.drinksfactory.app.refinedabstraction;

import com.aman.gof.drinksfactory.app.abstraction.DrinksBottle;
import com.aman.gof.drinksfactory.app.implementor.Drinks;

public class MountainDewBottle extends DrinksBottle {

    public MountainDewBottle(Drinks drinks) {
        super(drinks);
    }

    @Override
    public void manufactureBottle(int bottleCapacity) {
        System.out.println("Mountain Dew bottle manufactured.");
        System.out.println(drinks.fillDrink(bottleCapacity));
    }

}