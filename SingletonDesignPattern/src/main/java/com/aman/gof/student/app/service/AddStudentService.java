package com.aman.gof.student.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aman.gof.student.app.bean.StudentBean;

public class AddStudentService {

    public boolean addStudent(StudentBean studentBean, Connection connection) {

        String insertQuery = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

            preparedStatement.setInt(1, studentBean.getId());
            preparedStatement.setString(2, studentBean.getName());
            preparedStatement.setString(3, studentBean.getGender());
            preparedStatement.setString(4, studentBean.getCourse());
            preparedStatement.setString(5, studentBean.getEmail());
            preparedStatement.setLong(6, studentBean.getPhone());

            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while inserting data !!! ");
            System.out.println("Exception is: " + sqlException.getMessage());
            sqlException.printStackTrace();
        }

        return false;

    }

}