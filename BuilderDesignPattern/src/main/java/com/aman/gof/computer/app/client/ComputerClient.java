package com.aman.gof.computer.app.client;

import com.aman.gof.computer.app.builder.ComputerBuilder;
import com.aman.gof.computer.app.concretebuilder.DesktopBuilder;
import com.aman.gof.computer.app.concretebuilder.LaptopBuilder;
import com.aman.gof.computer.app.director.ComputerEngineer;

/**
 * The client creates director (ComputerEngineer) object using the builder
 * interface (ComputerBuilder) and gets the final product.
 */
public class ComputerClient {

    public static void main(String[] args) {

        ComputerBuilder laptopBuilder = new LaptopBuilder();
        ComputerEngineer laptopComputerEngineer = new ComputerEngineer(laptopBuilder);

        laptopComputerEngineer.manufactureComputer();

        System.out.println("Laptop manufactured with below specifications : " + laptopComputerEngineer.getComputer());
        laptopComputerEngineer.showComputerSpecification();

        ComputerBuilder desktopBuilder = new DesktopBuilder();
        ComputerEngineer desktopComputerEngineer = new ComputerEngineer(desktopBuilder);

        desktopComputerEngineer.manufactureComputer();

        System.out.println("Desktop manufactured with below specifications : " + desktopComputerEngineer.getComputer());
        desktopComputerEngineer.showComputerSpecification();

    }

}