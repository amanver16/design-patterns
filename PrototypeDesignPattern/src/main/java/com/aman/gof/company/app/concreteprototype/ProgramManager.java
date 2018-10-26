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
public class ProgramManager implements SoftwareCompanyEmployees {

    private int id;
    private String name;
    private String designation;
    private double salary;
    private String gender;

    @Override
    public ProgramManager clone() throws CloneNotSupportedException {
        System.out.println("Cloning Program Manager Object");
        return (ProgramManager) super.clone();
    }

    @Override
    public String work() {
        return "Program Manager is working now !!!";
    }

}