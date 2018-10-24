package com.aman.gof.drinks.app.client;

import java.util.Scanner;

import com.aman.gof.drinks.app.abstractfactory.DrinksAbstractFactory;
import com.aman.gof.drinks.app.concrete.Coffee;
import com.aman.gof.drinks.app.concrete.MangoJuice;
import com.aman.gof.drinks.app.concrete.MilkShake;
import com.aman.gof.drinks.app.concrete.Tea;
import com.aman.gof.drinks.app.factory.DrinksFactory;

public class DrinksClient {

    public static void main(String[] args) {

        // Get drinks factory
        DrinksAbstractFactory drinksAbstractFactory = new DrinksFactory();

        System.out.println("===========Please select a drink you want to enjoy===========");
        System.out.println("1. Tea");
        System.out.println("2. Coffee");
        System.out.println("3. Milk Shake");
        System.out.println("4. Mango Juice");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {

        case 1:
            Tea tea = (Tea) drinksAbstractFactory.getDrink("Tea");
            tea.prepareDrink();
            break;

        case 2:
            Coffee coffee = (Coffee) drinksAbstractFactory.getDrink("Coffee");
            coffee.prepareDrink();
            break;

        case 3:
            MilkShake milkShake = (MilkShake) drinksAbstractFactory.getDrink("MilkShake");
            milkShake.prepareDrink();
            break;

        case 4:
            MangoJuice mangoJuice = (MangoJuice) drinksAbstractFactory.getDrink("MangoJuice");
            mangoJuice.prepareDrink();
            break;

        default:
            System.out.println("Thanks for visiting.\nPlease give us a feedback about the drink.");
            break;

        }

        scanner.close();

    }

}