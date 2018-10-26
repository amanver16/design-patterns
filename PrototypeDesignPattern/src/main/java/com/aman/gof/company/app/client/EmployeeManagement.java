package com.aman.gof.company.app.client;

import com.aman.gof.company.app.prototype.SoftwareCompanyEmployees;
import com.aman.gof.company.app.prototypemanager.EmployeePrototypeManager;

/**
 * This class defines a client which creates a new object by asking the
 * prototype SoftwareCompanyEmployees to clone itself
 */
public class EmployeeManagement {

    public static void main(String[] args) {

        try {
            SoftwareCompanyEmployees softwareDeveloper = EmployeePrototypeManager
                    .getEmployeeInstance("SoftwareDeveloper");
            System.out.println(softwareDeveloper.work());
            SoftwareCompanyEmployees ceo = EmployeePrototypeManager.getEmployeeInstance("CEO");
            System.out.println(ceo.work());
            SoftwareCompanyEmployees businessAnalyst = EmployeePrototypeManager.getEmployeeInstance("BusinessAnalyst");
            System.out.println(businessAnalyst.work());
            SoftwareCompanyEmployees programManger = EmployeePrototypeManager.getEmployeeInstance("ProgramManger");
            System.out.println(programManger.work());
            SoftwareCompanyEmployees teamLeader = EmployeePrototypeManager.getEmployeeInstance("TeamLeader");
            System.out.println(teamLeader.work());
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            System.out.println("Error occurred during clone !!!");
            System.out.println("Exception is : " + cloneNotSupportedException.getMessage());
        }

    }

}