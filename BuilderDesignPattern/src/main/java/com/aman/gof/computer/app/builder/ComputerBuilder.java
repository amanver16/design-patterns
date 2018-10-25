package com.aman.gof.computer.app.builder;

import com.aman.gof.computer.app.product.Computer;

public interface ComputerBuilder {

    public void buildDisplay();

    public void buildKeyboard();

    public void buildMouse();

    public void buildRam();

    public void buildHardDisk();

    public void buildGraphicsCard();

    public void buildProcessor();

    public void buildBody();

    public void paintColor();

    public void installOperatingSystem();

    public Computer getComputer();

}