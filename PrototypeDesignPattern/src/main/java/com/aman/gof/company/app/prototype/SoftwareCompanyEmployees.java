package com.aman.gof.company.app.prototype;

/**
 * This class defines a prototype interface which declares a method responsible
 * for cloning itself
 */
public interface SoftwareCompanyEmployees extends Cloneable {

    public SoftwareCompanyEmployees clone() throws CloneNotSupportedException;
    public String work();

}