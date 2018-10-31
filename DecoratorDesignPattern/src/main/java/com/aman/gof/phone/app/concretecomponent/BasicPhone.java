package com.aman.gof.phone.app.concretecomponent;

import com.aman.gof.phone.app.component.Phone;

/**
 * This class represents concrete component that implements component and
 * defines the behavior. It may define additional behavior. We are going to
 * decorate this object to make it a smartphone using Smartphone Decorator
 */
public class BasicPhone implements Phone {

    @Override
    public void addFeatures() {
        System.out.println("Supports Calling Feature.");
    }

    public void makeCall() {
        System.out.println("Making call.");
    }

}