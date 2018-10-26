package com.aman.gof.vendingmachine.app.creator;

// import com.aman.gof.vendingmachine.app.concreteproduct.ColdDrinksVendingMachine;
// import com.aman.gof.vendingmachine.app.concreteproduct.FoodAndSnacksVendingMachine;
// import com.aman.gof.vendingmachine.app.concreteproduct.NewspaperVendingMachine;
import com.aman.gof.vendingmachine.app.product.VendingMachine;

/**
 * This class defines a factory or creator method which returns an abstract
 * product (Vending Machine) object. The subclasses of this class will implement
 * this factory method to return a concrete product object. In case of
 * parameterized factory method, we can pass type of vending machine in the
 * below method and ommit the concrete creators beacuse we can create this class
 * itself as a concreate creator and we can create objects of concrete products
 * based on the parameters passed in the below factory method.
 */
public abstract class VendingMachineFactory {

    public abstract VendingMachine getVendingMachine();

}

// Example of parameterized factory method
/* public class VendingMachineFactory {

    public static VendingMachine getVendingMachine(String vendingMachineType) {

        VendingMachine vendingMachine = null;

        if (vendingMachineType == null) {
            return null;
        }

        if ("FoodAndSnacks".equalsIgnoreCase(vendingMachineType)) {
            vendingMachine = new FoodAndSnacksVendingMachine();
        } else if ("Newspaper".equalsIgnoreCase(vendingMachineType)) {
            vendingMachine = new NewspaperVendingMachine();
        } else if ("ColdDrinks".equalsIgnoreCase(vendingMachineType)) {
            vendingMachine = new ColdDrinksVendingMachine();
        }

        return vendingMachine;

    }

} */