package com.aman.gof.drinksfactory.app.refinedabstraction;

import com.aman.gof.drinksfactory.app.abstraction.DrinksBottle;
import com.aman.gof.drinksfactory.app.implementor.Drinks;

public class ThumsUpBottle extends DrinksBottle {

    public ThumsUpBottle(Drinks drinks) {
        super(drinks);
    }

    @Override
    public void manufactureBottle(int bottleCapacity) {
        System.out.println("ThumsUp bottle manufactured.");
        System.out.println(drinks.fillDrink(bottleCapacity));
    }

}