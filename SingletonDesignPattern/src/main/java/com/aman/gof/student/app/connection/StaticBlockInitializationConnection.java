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
 * Static block initialization is similar to Eager Initialization, the
 * difference is instance is created in a static block and it provides way for
 * exception handling. This method is also not recommended beacuse it also
 * allocates resources at the time of class loading which is not best practice
 */
public class StaticBlockInitializationConnection {

    private static StaticBlockInitializationConnection staticBlockInitializationConnection;
    private Connection connection;

    private StaticBlockInitializationConnection() {

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

    // Static block for instance creation
    static {
        try {
            staticBlockInitializationConnection = new StaticBlockInitializationConnection();
        } catch (Exception exception) {
            throw new RuntimeException("Exception occurred while creating instance");
        }
    }

    public static StaticBlockInitializationConnection getInstance() {
        return staticBlockInitializationConnection;
    }

    public Connection getConnection() {
        return connection;
    }

}