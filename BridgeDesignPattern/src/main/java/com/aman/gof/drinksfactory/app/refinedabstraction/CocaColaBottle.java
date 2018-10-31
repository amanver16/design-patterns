package com.aman.gof.drinksfactory.app.refinedabstraction;

import com.aman.gof.drinksfactory.app.abstraction.DrinksBottle;
import com.aman.gof.drinksfactory.app.implementor.Drinks;

/**
 * This class defines concrete implementation of Implementor interface (Drinks)
 */
public class CocaColaBottle extends DrinksBottle {

    public CocaColaBottle(Drinks drinks) {
        super(drinks);
    }

    @Override
    public void manufactureBottle(int bottleCapacity) {
        System.out.println("Coca Cola bottle manufactured.");
        System.out.println(drinks.fillDrink(bottleCapacity));
    }

}