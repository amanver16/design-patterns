package com.aman.gof.vendingmachine.app.client;

import java.util.Scanner;

import com.aman.gof.vendingmachine.app.concretecreator.ColdDrinksVendingMachineFactory;
import com.aman.gof.vendingmachine.app.concretecreator.FoodAndSnacksVendingMachineFactory;
import com.aman.gof.vendingmachine.app.concretecreator.NewspaperVendingMachineFactory;
import com.aman.gof.vendingmachine.app.product.VendingMachine;

public class Customer {

    public static void main(String[] args) {

        System.out.println("Select a vending machine :");
        System.out.println("1. Food And Snacks");
        System.out.println("2. Newspaper");
        System.out.println("3. Cold Drinks");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();

        switch (choice) {

        case 1:
            FoodAndSnacksVendingMachineFactory foodAndSnacksVendingMachineFactory = new FoodAndSnacksVendingMachineFactory();
            VendingMachine foodAndSnacksVendingMachine = foodAndSnacksVendingMachineFactory.getVendingMachine();
            System.out.println("Please collect your " + foodAndSnacksVendingMachine.vend(100, "Burger"));
            break;

        case 2:
            NewspaperVendingMachineFactory newspaperVendingMachineFactory = new NewspaperVendingMachineFactory();
            VendingMachine newspaperVendingMachine = newspaperVendingMachineFactory.getVendingMachine();
            System.out.println("Please collect your " + newspaperVendingMachine.vend(10, "Dainik Jagran"));
            break;

        case 3:
            ColdDrinksVendingMachineFactory coldDrinksVendingMachineFactory = new ColdDrinksVendingMachineFactory();
            VendingMachine coldDrinksVendingMachine = coldDrinksVendingMachineFactory.getVendingMachine();
            System.out.println("Please collect your " + coldDrinksVendingMachine.vend(50, "Sprite"));
            break;

        default:
            System.out.println(" Sorry !!! Vending Machine service is unavialable.");

        }

        // To use parameterized factory method, we can create required vending machine object like this
        // VendingMachineFactory vendingMachineFactory = new VendingMachineFactory();
        // VendingMachine foodAndSnacksVendingMachine = vendingMachineFactory.getVendingMachine("FoodAndSnacks");
        // VendingMachine newspaperVendingMachine = vendingMachineFactory.getVendingMachine("Newspaper");
        // VendingMachine coldDrinksVendingMachine = vendingMachineFactory.getVendingMachine("ColdDrinks");

    }

}