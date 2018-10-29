package com.aman.gof.student.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aman.gof.student.app.bean.StudentBean;

public class ViewStudentService {

    public StudentBean viewStudent(int id, Connection connection) {

        String viewQuery = "SELECT *FROM STUDENT WHERE ID=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(viewQuery)) {

            preparedStatement.setInt(1, id);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {

                if (resultSet.next()) {

                    StudentBean studentBean = new StudentBean();

                    studentBean.setId(resultSet.getInt(1));
                    studentBean.setName(resultSet.getString(2));
                    studentBean.setGender(resultSet.getString(3));
                    studentBean.setCourse(resultSet.getString(4));
                    studentBean.setEmail(resultSet.getString(5));
                    studentBean.setPhone(resultSet.getLong(6));

                    return studentBean;
                }
            }

        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while exctracting data !!! ");
            System.out.println("Exception is: " + sqlException.getMessage());
            sqlException.printStackTrace();
        }

        return null;

    }

}