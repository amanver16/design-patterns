package com.aman.gof.student.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudentService {

    public boolean deleteStudent(int id, Connection connection) {

        String deleteQuery = "DELETE FROM STUDENT WHERE ID=?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setInt(1, id);

            if (preparedStatement.executeUpdate() > 0) {
                return true;
            }

        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while deleting data !!! ");
            System.out.println("Exception is: " + sqlException.getMessage());
            sqlException.printStackTrace();
        }

        return false;

    }

}