package com.aman.gof.vendingmachine.app.concreteproduct;

import com.aman.gof.vendingmachine.app.product.VendingMachine;

/**
 * This class defines concrete product (Newspaper Vending Machine) which
 * implements Vending Machine interface and vends only newspapers
 */
public class NewspaperVendingMachine implements VendingMachine {

    @Override
    public String vend(long money, String newspaper) {

        if (money == 0) {
            return "Sorry !!! Please pay the amount first.";
        }

        if ("Times of India".equalsIgnoreCase(newspaper) && money == 10) {
            return "Times of India";
        } else if ("Hindustan".equalsIgnoreCase(newspaper) && money == 10) {
            return "Hindustan";
        } else if ("Dainik Jagran".equalsIgnoreCase(newspaper) && money == 10) {
            return "Dainik Jagran";
        } else if ("Dainik Bhaskar".equalsIgnoreCase(newspaper) && money == 10) {
            return "Dainik Bhaskar";
        } else if ("The Hindu".equalsIgnoreCase(newspaper) && money == 10) {
            return "The Hindu";
        } else {
            return "Sorry !!! The item you are looking for is not available.";
        }

    }

}