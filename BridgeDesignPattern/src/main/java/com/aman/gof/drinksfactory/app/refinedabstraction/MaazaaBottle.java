package com.aman.gof.drinksfactory.app.refinedabstraction;

import com.aman.gof.drinksfactory.app.abstraction.DrinksBottle;
import com.aman.gof.drinksfactory.app.implementor.Drinks;

public class MaazaaBottle extends DrinksBottle {

    public MaazaaBottle(Drinks drinks) {
        super(drinks);
    }

    @Override
    public void manufactureBottle(int bottleCapacity) {
        System.out.println("Maazaa bottle manufactured.");
        System.out.println(drinks.fillDrink(bottleCapacity));
    }

}