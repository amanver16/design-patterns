package com.aman.gof.phone.app.component;

/**
 * This interface represents component which is implemented by concrete
 * component (Basic Phone) and decorator (Smartphone Decorator). This provides a
 * way to add features to concrete objects dynamically
 */
public interface Phone {

    public void addFeatures();

}