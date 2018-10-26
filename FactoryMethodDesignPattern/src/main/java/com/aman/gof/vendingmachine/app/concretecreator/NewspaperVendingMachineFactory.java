package com.aman.gof.vendingmachine.app.concretecreator;

import com.aman.gof.vendingmachine.app.concreteproduct.NewspaperVendingMachine;
import com.aman.gof.vendingmachine.app.creator.VendingMachineFactory;
import com.aman.gof.vendingmachine.app.product.VendingMachine;

/**
 * This class defines concrete factory/creator which returns concrete product
 * (NewspaperVendingMachine) object
 */
public class NewspaperVendingMachineFactory extends VendingMachineFactory {

    @Override
    public VendingMachine getVendingMachine() {
        return new NewspaperVendingMachine();
    }

}