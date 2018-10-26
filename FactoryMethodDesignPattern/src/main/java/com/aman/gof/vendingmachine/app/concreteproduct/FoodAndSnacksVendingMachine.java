package com.aman.gof.vendingmachine.app.concreteproduct;

/**
 * This class defines concrete product (Food and Snacks Vending Machine) which implements Vending Machine interface and vends only food and snacks
 */
import com.aman.gof.vendingmachine.app.product.VendingMachine;

public class FoodAndSnacksVendingMachine implements VendingMachine {

    @Override
    public String vend(long money, String item) {

        if (money == 0) {
            return "Sorry !!! Please pay the amount first.";
        }

        if ("Chocolate".equalsIgnoreCase(item) && money == 100) {
            return "Chocolate";
        } else if ("Burger".equalsIgnoreCase(item) && money == 100) {
            return "Burger";
        } else if ("Cookies".equalsIgnoreCase(item) && money == 100) {
            return "Cookies";
        } else if ("Cup-cake".equalsIgnoreCase(item) && money == 100) {
            return "Cup-cake";
        } else if ("Ice-cream".equalsIgnoreCase(item) && money == 100) {
            return "Ice-cream";
        } else {
            return "Sorry !!! The item you are looking for is not available.";
        }

    }

}