package com.example.video_management.UserControllers;

import com.example.video_management.JdbcControllers.JdbcConnection;
import com.example.video_management.models.VideoModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VideoControllers {
    static Connection connection = null;

    public static boolean addVideo(VideoModel videoModel) {
        boolean isAdded = false;
        try {
            connection = JdbcConnection.getConnection();
            if (connection != null) {
                String query = "INSERT INTO videos(title, description, video_data) VALUES (?, ? ,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, videoModel.getTitle());
                preparedStatement.setString(2, videoModel.getDescription());
                preparedStatement.setBytes(3, videoModel.getVideoData());
                isAdded = preparedStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return isAdded;
    }
}
