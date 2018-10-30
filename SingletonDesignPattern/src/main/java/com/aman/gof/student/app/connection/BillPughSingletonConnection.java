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
 * This approach is most widely used. In this method a separate static inner
 * class is used to create the instance of singleton class. So this class is not
 * loaded into memory when the singleton class is loaded. Only when the
 * getInstance() method is called then it is loaded.
 */
public class BillPughSingletonConnection {

    private Connection connection;

    private BillPughSingletonConnection() {

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

    // Static Singleton Helper class Bill Pugh Method
    private static class BillPughSingleton {
        private static final BillPughSingletonConnection BILL_PUGH_SINGLETON_CONNECTION = new BillPughSingletonConnection();
    }

    public static BillPughSingletonConnection getInstance() {
        return BillPughSingleton.BILL_PUGH_SINGLETON_CONNECTION;
    }

    public Connection getConnection() {
        return connection;
    }

}