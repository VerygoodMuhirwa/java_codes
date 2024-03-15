package com.example.video_management.UserControllers;

import com.example.video_management.JdbcControllers.JdbcConnection;
import com.example.video_management.models.UserModel;
import jakarta.ws.rs.NotAllowedException;

import java.sql.*;
import java.util.Objects;

public class UserControlllers {
    static Connection connection = null;
    static boolean isCreated = false;

    public static boolean createUser(UserModel user) {
        connection = JdbcConnection.getConnection();
        try {
            if (connection != null) {
                String query = "INSERT INTO users(username, email, password, age) values(?,?,?,?) ";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, user.getUsername());
                preparedStatement.setString(2, user.getEmail());
                preparedStatement.setString(3, user.getPassword());
                preparedStatement.setInt(4,user.getAge() );
                int affectedRows = preparedStatement.executeUpdate();
                isCreated = affectedRows > 0;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return isCreated;
    }

    static boolean isLoggedIn;

    public static boolean loginUser(UserModel user) {
        Connection connection = JdbcConnection.getConnection();
        try {
            if (connection != null) {
                String query = "SELECT * FROM users WHERE email = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, user.getEmail());
                ResultSet rs = statement.executeQuery();
                if (rs.next()) {
                    String existingUserPassword = rs.getString("password");
                    if (existingUserPassword.equals(user.getPassword())) {
                        System.out.println("User logged in successfully");
                        isLoggedIn = true;
                    } else {
                        System.out.println("Invalid email or password");
                        throw new NotAllowedException("Invalid email or password");
                    }
                } else {
                    System.out.println("Invalid email or password");
                    throw new NotAllowedException("Invalid email or password");
                }
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return isLoggedIn;
    }


}
