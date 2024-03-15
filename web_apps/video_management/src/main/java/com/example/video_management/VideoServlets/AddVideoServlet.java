package com.example.video_management.VideoServlets;

import com.example.video_management.UserControllers.VideoControllers;
import com.example.video_management.models.VideoModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AddVideoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        byte[] videoData = req.getParameter("videoData").getBytes();
        String title = req.getParameter("title");
        String description = req.getParameter("description");

        VideoModel videoModel= null;
        if(VideoControllers.addVideo(videoModel)){
            PrintWriter out= resp.getWriter();


        }
    }
}
