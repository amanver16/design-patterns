package com.aman.gof.computer.app.concretebuilder;

import com.aman.gof.computer.app.builder.ComputerBuilder;
import com.aman.gof.computer.app.product.Computer;

/**
 * This class provides concrete implementation of ComputerBuilder interface to
 * build a Desktop. And returns the concrete object after constructing it.
 */
public class DesktopBuilder implements ComputerBuilder {

    private Computer desktop;

    public DesktopBuilder() {
        this.desktop = new Computer();
    }

    @Override
    public void buildDisplay() {
        desktop.setDisplay("20 inch");
    }

    @Override
    public void buildKeyboard() {
        desktop.setKeyboard("USB Qwerty Keyboard");
    }

    @Override
    public void buildMouse() {
        desktop.setMouse("USB Mouse");
    }

    @Override
    public void buildRam() {
        desktop.setRam("16 GB");
    }

    @Override
    public void buildHardDisk() {
        desktop.setHarddisk("2 TB");
    }

    @Override
    public void buildGraphicsCard() {
        desktop.setGraphicsCard("4 GB");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("Intel i7 8th Generation");
    }

    @Override
    public void buildBody() {
        desktop.setBody("Premium Metal");
    }

    @Override
    public void paintColor() {
        desktop.setColor("Black");
    }

    @Override
    public void installOperatingSystem() {
        desktop.setOperatingSystem("Ubuntu");
    }

    @Override
    public Computer getComputer() {
        return this.desktop;
    }

}