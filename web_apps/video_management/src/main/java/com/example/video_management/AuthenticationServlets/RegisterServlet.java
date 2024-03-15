package com.example.video_management.AuthenticationServlets;

import com.example.video_management.UserControllers.UserControlllers;
import com.example.video_management.models.UserModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        int age= Integer.parseInt(req.getParameter("age"));
        UserModel user = null;
        user.setPassword(password);
        user.setEmail(email);
        user.setUsername(username);
        user.setAge(age);

        if(UserControlllers.createUser(user)){
            System.out.println("User created successfully");
            resp.sendRedirect("/video_management_war_exploded/login");
        };
    }
}
