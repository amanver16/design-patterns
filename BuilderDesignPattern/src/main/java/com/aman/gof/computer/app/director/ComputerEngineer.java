package com.aman.gof.computer.app.director;

import com.aman.gof.computer.app.builder.ComputerBuilder;
import com.aman.gof.computer.app.product.Computer;

/**
 * This class is Director. In builder pattern a director class construct an
 * object using builder interface. Thus it creates an object of ComputerBuilder
 * interface and manufactures the required computer.
 */
public class ComputerEngineer {

    private ComputerBuilder computerBuilder;

    // Get Builder Object
    public ComputerEngineer(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    // Get the product to be built
    public Computer getComputer() {
        return this.computerBuilder.getComputer();
    }

    // Manufacture Computer
    public void manufactureComputer() {
        this.computerBuilder.buildDisplay();
        this.computerBuilder.buildKeyboard();
        this.computerBuilder.buildMouse();
        this.computerBuilder.buildHardDisk();
        this.computerBuilder.buildGraphicsCard();
        this.computerBuilder.buildRam();
        this.computerBuilder.buildProcessor();
        this.computerBuilder.buildBody();
        this.computerBuilder.paintColor();
        this.computerBuilder.installOperatingSystem();
    }

    public void showComputerSpecification() {
        System.out.println("Display         :   " + getComputer().getDisplay());
        System.out.println("Keyboard        :   " + getComputer().getKeyboard());
        System.out.println("Mouse           :   " + getComputer().getMouse());
        System.out.println("Hard Disk       :   " + getComputer().getHarddisk());
        System.out.println("Graphics Card   :   " + getComputer().getGraphicsCard());
        System.out.println("RAM             :   " + getComputer().getRam());
        System.out.println("Processor       :   " + getComputer().getProcessor());
        System.out.println("Body            :   " + getComputer().getBody());
        System.out.println("Color           :   " + getComputer().getColor());
        System.out.println("OS              :   " + getComputer().getOperatingSystem());
    }

}