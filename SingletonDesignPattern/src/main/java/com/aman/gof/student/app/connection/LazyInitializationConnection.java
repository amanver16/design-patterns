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
 * In Lazy Initialization method the instance is created in a public static
 * method. So instance will be only available when client calls this method.
 * This approach is not thread safe. In multithreading environment two threads
 * can create multiple instances which is violation of singleton
 */
public class LazyInitializationConnection {

    private static LazyInitializationConnection lazyInitializationConnection;
    private Connection connection;

    private LazyInitializationConnection() {

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

    public static LazyInitializationConnection getInstance() {

        if (lazyInitializationConnection == null) {
            lazyInitializationConnection = new LazyInitializationConnection();
        }

        return lazyInitializationConnection;

    }

    public Connection getConnection() {
        return connection;
    }

}