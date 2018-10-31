package com.aman.gof.phone.app.concretedecorator;

import com.aman.gof.phone.app.decorator.SmartphoneDecorator;

/**
 * This class represents concrete decorator which defines the decorating
 * behavior.
 */
public class TouchScreenDecorator implements SmartphoneDecorator {

    @Override
    public void addFeatures() {
        System.out.println("Added touch screen features.");
    }

}