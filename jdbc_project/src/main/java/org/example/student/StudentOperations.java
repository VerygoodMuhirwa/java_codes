package org.example.student;

import java.sql.*;

public class InsertStudent {
    static  Connection connection = null;
    public static void insertStudent(Student s) throws SQLException, ClassNotFoundException {
        if (JdbcConnection.getConnection() != null) {
            connection = JdbcConnection.getConnection();
            String query = "INSERT INTO students (firstname, lastname, email, password, studentId) values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,s.getFirstnamel() );
            preparedStatement.setString(2, s.getLastname());
            preparedStatement.setString(3, s.getEmail());
            preparedStatement.setString(4, s.getPassword());
            preparedStatement.setInt(5, s.getStudentId());
            int affectedRows = preparedStatement.executeUpdate();

            if(affectedRows > 0){
                System.out.println("New student added successfully");
            }else{
                System.out.println("Failed to add the student ");
            }
        }
    }

}
