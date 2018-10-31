package com.aman.gof.drinksfactory.app.refinedabstraction;

import com.aman.gof.drinksfactory.app.abstraction.DrinksBottle;
import com.aman.gof.drinksfactory.app.implementor.Drinks;

public class SpriteBottle extends DrinksBottle {

    public SpriteBottle(Drinks drinks) {
        super(drinks);
    }

    @Override
    public void manufactureBottle(int bottleCapacity) {
        System.out.println("Sprite bottle manufactured.");
        System.out.println(drinks.fillDrink(bottleCapacity));
    }

}