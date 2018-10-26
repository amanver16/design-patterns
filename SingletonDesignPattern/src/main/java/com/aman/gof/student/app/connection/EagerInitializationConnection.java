package com.aman.gof.student.app.connection;

public class EagerInitializationConnection {

    private static final EagerInitializationConnection eagerInitializationConnection = new EagerInitializationConnection();

    private EagerInitializationConnection() {}

    public EagerInitializationConnection getInstance() {
        return eagerInitializationConnection;
    }

}