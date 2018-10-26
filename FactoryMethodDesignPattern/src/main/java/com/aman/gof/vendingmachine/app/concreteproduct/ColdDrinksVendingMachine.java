package com.aman.gof.vendingmachine.app.concreteproduct;

import com.aman.gof.vendingmachine.app.product.VendingMachine;

/**
 * This class defines concrete product (Cold Drinks Vending Machine) which
 * implements Vending Machine interface and vends only cold drinks
 */
public class ColdDrinksVendingMachine implements VendingMachine {

    @Override
    public String vend(long money, String coldDrink) {

        if (money == 0) {
            return "Sorry !!! Please pay the amount first.";
        }

        if ("Coca Cola".equalsIgnoreCase(coldDrink) && money == 50) {
            return "Coca Cola";
        } else if ("Pepsi".equalsIgnoreCase(coldDrink) && money == 50) {
            return "Pepsi";
        } else if ("Sprite".equalsIgnoreCase(coldDrink) && money == 50) {
            return "Sprite";
        } else if ("Mirinda".equalsIgnoreCase(coldDrink) && money == 50) {
            return "Mirinda";
        } else if ("Maaza".equalsIgnoreCase(coldDrink) && money == 50) {
            return "Maaza";
        } else {
            return "Sorry !!! The item you are looking for is not available.";
        }

    }

}