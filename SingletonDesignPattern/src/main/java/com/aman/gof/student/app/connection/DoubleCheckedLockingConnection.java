package com.aman.gof.student.app.connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * This approach is similar to thread safe singleton, but we are double checking
 * the instance before and after using synchronize. This ensures the instance is
 * created only once for all threads. This removes overhead and increases
 * performance.
 */
public class DoubleCheckedLockingConnection {

    private static DoubleCheckedLockingConnection doubleCheckedLockingConnection;
    private Connection connection;

    private DoubleCheckedLockingConnection() {

        Properties properties = new Properties();
        File propertiesFile = new File("src/main/resources/connection.properties");

        try {
            InputStream readPropertiesFile = new FileInputStream(propertiesFile);
            properties.load(readPropertiesFile);
        } catch (IOException ioException) {
            System.out.println("Exception occurred while reading properties file !!! ");
            System.out.println("Exception is: " + ioException.getMessage());
            System.out.println(("Cause is: " + ioException.getStackTrace()));
        }

        String serverUrl = properties.getProperty("SERVER_URL");
        String databaseName = properties.getProperty("DATABASE_NAME");
        String username = properties.getProperty("USERNAME");
        String password = properties.getProperty("PASSWORD");

        try {
            connection = DriverManager.getConnection(serverUrl + databaseName, username, password);
            System.out.println("Connection Established : " + connection.toString());
        } catch (SQLException sqlException) {
            System.out.println("Exception occurred while connecting to database server !!! ");
            System.out.println("Exception is: " + sqlException.getMessage());
            System.out.println(("Cause is: " + sqlException.getStackTrace()));
        }

    }

    public static DoubleCheckedLockingConnection getInstance() {

        if (doubleCheckedLockingConnection == null) {
            synchronized (DoubleCheckedLockingConnection.class) {
                if (doubleCheckedLockingConnection == null) {
                    doubleCheckedLockingConnection = new DoubleCheckedLockingConnection();
                }
            }
        }

        return doubleCheckedLockingConnection;

    }

    public Connection getConnection() {
        return connection;
    }

}