package com.aman.gof.student.app.client;

import java.sql.Connection;
import java.util.Scanner;

import com.aman.gof.student.app.bean.StudentBean;
import com.aman.gof.student.app.connection.EagerInitializationConnection;
import com.aman.gof.student.app.service.AddStudentService;
import com.aman.gof.student.app.service.DeleteStudentService;
import com.aman.gof.student.app.service.ViewStudentService;

public class StudentClient {

    public static void main(String[] args) {

        // Get Singleton instance of Connection object
        EagerInitializationConnection eagerInitializationConnection = EagerInitializationConnection.getInstance();
        Connection connection = eagerInitializationConnection.getConnection();
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Please select an operation: ");
            System.out.println("1. Add Student.");
            System.out.println("2. View Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
            case 1:
                callAddStudentService(connection);
                break;
            case 2:
                callViewStudentService(connection);
                break;
            case 3:
                callDeleteStudentService(connection);
                break;
            case 4:
                System.exit(0);
                scanner.close();
            default:
                System.out.println("Wrong Choice !!!");
                break;
            }

        } while (true);

    }

    // Calling add student service
    public static void callAddStudentService(Connection connection) {

        StudentBean studentBean = new StudentBean();

        studentBean.setId(2);
        studentBean.setName("Ravi");
        studentBean.setGender("Male");
        studentBean.setCourse("BCA");
        studentBean.setEmail("ravi123@gmail.com");
        studentBean.setPhone(543335453);

        AddStudentService addStudentService = new AddStudentService();

        if (addStudentService.addStudent(studentBean, connection)) {
            System.out.println("Student Added Successfully !!!");
        } else {
            System.out.println("Student Not Added !!!");
        }

    }

    // Calling view student service
    public static void callViewStudentService(Connection connection) {

        ViewStudentService viewStudentService = new ViewStudentService();
        StudentBean studentBean = viewStudentService.viewStudent(2, connection);

        if (studentBean != null) {
            System.out.println("Displaying student data :");
            System.out.println("Id      :   " + studentBean.getId());
            System.out.println("Name    :   " + studentBean.getName());
            System.out.println("Gender  :   " + studentBean.getGender());
            System.out.println("Course  :   " + studentBean.getCourse());
            System.out.println("Email   :   " + studentBean.getEmail());
            System.out.println("Phone   :   " + studentBean.getPhone());
        } else {
            System.out.println("Student Not Available !!!");
        }
    }

    // Calling delete student service
    public static void callDeleteStudentService(Connection connection) {

        DeleteStudentService deleteStudentService = new DeleteStudentService();

        if (deleteStudentService.deleteStudent(2, connection)) {
            System.out.println("Student Deleted Successfully !!!");
        } else {
            System.out.println("Student Not Available !!!");
        }

    }

}