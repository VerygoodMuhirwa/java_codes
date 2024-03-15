package com.example.video_management.JdbcControllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    static String username = "postgres";
    static String password = "1234";
    static String jdbcUrl = "jdbc:postgresql://localhost:5433/video_management";
    static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            return connection;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
