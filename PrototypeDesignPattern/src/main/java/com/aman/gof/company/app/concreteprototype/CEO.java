package com.aman.gof.company.app.concreteprototype;

import com.aman.gof.company.app.prototype.SoftwareCompanyEmployees;

import lombok.Getter;
import lombok.Setter;

/**
 * This class defines a concrete prototype which implements the prototype
 * interface and defines clone method which returns a copy of protoype object.
 * Hence using the copy of same object rather than creating a new one.
 */
@Getter
@Setter
public class CEO implements SoftwareCompanyEmployees {

    private int id;
    private String name;
    private String designation;
    private double salary;
    private String gender;

    @Override
    public CEO clone() throws CloneNotSupportedException {
        System.out.println("Cloning CEO Object");
        return (CEO) super.clone();
    }

    @Override
    public String work() {
        return "CEO is working now !!!";
    }

}