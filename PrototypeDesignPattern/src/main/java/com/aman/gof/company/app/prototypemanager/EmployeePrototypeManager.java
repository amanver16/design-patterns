package com.aman.gof.company.app.prototypemanager;

import java.util.HashMap;
import java.util.Map;

import com.aman.gof.company.app.concreteprototype.BusinessAnalyst;
import com.aman.gof.company.app.concreteprototype.CEO;
import com.aman.gof.company.app.concreteprototype.ProgramManager;
import com.aman.gof.company.app.concreteprototype.SoftwareDeveloper;
import com.aman.gof.company.app.concreteprototype.TeamLeader;
import com.aman.gof.company.app.prototype.SoftwareCompanyEmployees;

/**
 * This class defines a prototype manager class which stores existing objects to be
 * cloned in a hash map and defines a method to return the cloned object
 */
public class EmployeePrototypeManager {

    public static Map<String, SoftwareCompanyEmployees> softwareCompanyEmployeesMap = new HashMap<>();

    static {
        softwareCompanyEmployeesMap.put("CEO", new CEO());
        softwareCompanyEmployeesMap.put("BusinessAnalyst", new BusinessAnalyst());
        softwareCompanyEmployeesMap.put("ProgramManger", new ProgramManager());
        softwareCompanyEmployeesMap.put("TeamLeader", new TeamLeader());
        softwareCompanyEmployeesMap.put("SoftwareDeveloper", new SoftwareDeveloper());
    }

    public static SoftwareCompanyEmployees getEmployeeInstance(String employeeCode) throws CloneNotSupportedException {
        return (SoftwareCompanyEmployees) softwareCompanyEmployeesMap.get(employeeCode).clone();
    }

}