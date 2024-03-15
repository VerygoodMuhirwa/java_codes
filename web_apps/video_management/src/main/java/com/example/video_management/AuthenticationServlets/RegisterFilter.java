package com.example.video_management.AuthenticationServlets;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String ageParameter = servletRequest.getParameter("age");
        if (ageParameter != null && !ageParameter.isEmpty()) {
            int age = Integer.parseInt(ageParameter);
            if (age < 18) {
                PrintWriter out = servletResponse.getWriter();
                servletResponse.setContentType("text/html");
                out.println("Too young to create an account");
            }
            filterChain.doFilter(servletRequest,servletResponse);
        } else {
            PrintWriter out = servletResponse.getWriter();
            servletResponse.setContentType("text/html");
            out.println("Age parameter is missing or empty");
        }

    }
}
