package com.aman.gof.drinksfactory.app.refinedabstraction;

import com.aman.gof.drinksfactory.app.abstraction.DrinksBottle;
import com.aman.gof.drinksfactory.app.implementor.Drinks;

public class LimcaBottle extends DrinksBottle {

    public LimcaBottle(Drinks drinks) {
        super(drinks);
    }

    @Override
    public void manufactureBottle(int bottleCapacity) {
        System.out.println("Limca bottle manufactured.");
        System.out.println(drinks.fillDrink(bottleCapacity));
    }

}