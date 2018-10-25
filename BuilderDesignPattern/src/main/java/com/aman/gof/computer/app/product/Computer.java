package com.aman.gof.computer.app.product;

import lombok.Getter;

/**
 * This is the Product skelton which helps build concrete product step by step as a result of
 * concrete builder
 */
@Getter
public class Computer implements ComputerSetup {

    private String display;
    private String keyboard;
    private String mouse;
    private String ram;
    private String harddisk;
    private String graphicsCard;
    private String processor;
    private String body;
    private String color;
    private String operatingSystem;

    @Override
    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    @Override
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}