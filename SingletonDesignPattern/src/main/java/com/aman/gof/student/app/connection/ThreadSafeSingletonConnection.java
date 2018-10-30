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
 * This way of creating singleton instance is thread safe, but it decreases
 * performance beacuse of synchronization. To make a singleton instance thread
 * safe, synchronize keyword is used
 */
public class ThreadSafeSingletonConnection {

    private static ThreadSafeSingletonConnection threadSafeSingletonConnection;
    private Connection connection;

    private ThreadSafeSingletonConnection() {

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

    public static synchronized ThreadSafeSingletonConnection getInstance() {

        if (threadSafeSingletonConnection == null) {
            threadSafeSingletonConnection = new ThreadSafeSingletonConnection();
        }

        return threadSafeSingletonConnection;

    }

    public Connection getConnection() {
        return connection;
    }

}