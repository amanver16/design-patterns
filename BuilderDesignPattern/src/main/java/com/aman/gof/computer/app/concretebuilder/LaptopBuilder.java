package com.aman.gof.computer.app.concretebuilder;

import com.aman.gof.computer.app.builder.ComputerBuilder;
import com.aman.gof.computer.app.product.Computer;

/**
 * This class provides concrete implementation of ComputerBuilder interface to
 * build a Laptop. And returns the concrete object after constructing it.
 */
public class LaptopBuilder implements ComputerBuilder {

    private Computer laptop;

    public LaptopBuilder() {
        this.laptop = new Computer();
    }

    @Override
    public void buildDisplay() {
        laptop.setDisplay("15.6 inch");
    }

    @Override
    public void buildKeyboard() {
        laptop.setKeyboard("Qwerty Keyboard");
    }

    @Override
    public void buildMouse() {
        laptop.setMouse("Touchpad");
    }

    @Override
    public void buildRam() {
        laptop.setRam("8 GB");
    }

    @Override
    public void buildHardDisk() {
        laptop.setHarddisk("1 TB");
    }

    @Override
    public void buildGraphicsCard() {
        laptop.setGraphicsCard("2 GB");
    }

    @Override
    public void buildProcessor() {
        laptop.setProcessor("Intel i5 8th Generation");
    }

    @Override
    public void buildBody() {
        laptop.setBody("Premium Metal");
    }

    @Override
    public void paintColor() {
        laptop.setColor("Silver");
    }

    @Override
    public void installOperatingSystem() {
        laptop.setOperatingSystem("Windows 10 Pro");
    }

    @Override
    public Computer getComputer() {
        return this.laptop;
    }

}