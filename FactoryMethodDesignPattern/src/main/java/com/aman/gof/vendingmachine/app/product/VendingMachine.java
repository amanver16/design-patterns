package com.aman.gof.vendingmachine.app.product;

/**
 * The VendingMachine defines an abstract product Vending Machine which vends an item
 */
public interface VendingMachine {

    public String vend(long money, String item);

}