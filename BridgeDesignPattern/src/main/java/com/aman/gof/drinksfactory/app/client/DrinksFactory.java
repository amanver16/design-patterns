package com.aman.gof.drinksfactory.app.client;

import com.aman.gof.drinksfactory.app.abstraction.DrinksBottle;
import com.aman.gof.drinksfactory.app.concreteimplementor.CocaCola;
import com.aman.gof.drinksfactory.app.concreteimplementor.Limca;
import com.aman.gof.drinksfactory.app.concreteimplementor.Maazaa;
import com.aman.gof.drinksfactory.app.concreteimplementor.MountainDew;
import com.aman.gof.drinksfactory.app.concreteimplementor.Pepsi;
import com.aman.gof.drinksfactory.app.concreteimplementor.SevenUp;
import com.aman.gof.drinksfactory.app.concreteimplementor.Slice;
import com.aman.gof.drinksfactory.app.concreteimplementor.Sprite;
import com.aman.gof.drinksfactory.app.concreteimplementor.ThumsUp;
import com.aman.gof.drinksfactory.app.refinedabstraction.CocaColaBottle;
import com.aman.gof.drinksfactory.app.refinedabstraction.LimcaBottle;
import com.aman.gof.drinksfactory.app.refinedabstraction.MaazaaBottle;
import com.aman.gof.drinksfactory.app.refinedabstraction.MountainDewBottle;
import com.aman.gof.drinksfactory.app.refinedabstraction.PepsiBottle;
import com.aman.gof.drinksfactory.app.refinedabstraction.SevenUpBottle;
import com.aman.gof.drinksfactory.app.refinedabstraction.SliceBottle;
import com.aman.gof.drinksfactory.app.refinedabstraction.SpriteBottle;
import com.aman.gof.drinksfactory.app.refinedabstraction.ThumsUpBottle;

/**
 * The client creates abstract class object to perform an operation. it has
 * access to only abstraction part and not concerned about implementation part
 */
public class DrinksFactory {

    public static void main(String[] args) {

        int drinkQuantity = 500;

        DrinksBottle pepsi = new PepsiBottle(new Pepsi());
        pepsi.manufactureBottle(drinkQuantity);

        DrinksBottle cocaCola = new CocaColaBottle(new CocaCola());
        cocaCola.manufactureBottle(drinkQuantity);

        DrinksBottle thumsUp = new ThumsUpBottle(new ThumsUp());
        thumsUp.manufactureBottle(drinkQuantity);

        DrinksBottle sprite = new SpriteBottle(new Sprite());
        sprite.manufactureBottle(drinkQuantity);

        DrinksBottle maazaa = new MaazaaBottle(new Maazaa());
        maazaa.manufactureBottle(drinkQuantity);

        DrinksBottle slice = new SliceBottle(new Slice());
        slice.manufactureBottle(drinkQuantity);

        DrinksBottle mountainDew = new MountainDewBottle(new MountainDew());
        mountainDew.manufactureBottle(drinkQuantity);

        DrinksBottle limca = new LimcaBottle(new Limca());
        limca.manufactureBottle(drinkQuantity);

        DrinksBottle sevenUp = new SevenUpBottle(new SevenUp());
        sevenUp.manufactureBottle(drinkQuantity);

    }

}