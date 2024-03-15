package com.example.video_management.AuthenticationServlets;

import com.example.video_management.UserControllers.UserControlllers;
import com.example.video_management.models.UserModel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        UserModel user = null;
        user.setEmail(email);
        user.setPassword(password);
        if(UserControlllers.loginUser(user)){
            System.out.println("User logged in successfully");
            HttpSession session= req.getSession();
            session.setAttribute("userEmail", email);
           resp.sendRedirect("/video_management_war_exploded/welcome");
        }
    }
}
