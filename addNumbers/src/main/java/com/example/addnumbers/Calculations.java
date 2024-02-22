package com.example.addnumbers;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

//@WebServlet(name = "AdditionServlet", value = "/add")
public class Calculations extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int firstNum = Integer.parseInt(req.getParameter("firstnum"));
        int secondNum = Integer.parseInt(req.getParameter("secondnum"));
        String operationType= (String) req.getParameter("operation");
        req.setAttribute("firstnum", firstNum);
        req.setAttribute("secondnum", secondNum);
        RequestDispatcher rd;
        if(operationType.equals("addition")){
            rd= req.getRequestDispatcher("addition");
            rd.forward(req,resp);
        } else if (operationType.equals("subtraction")){
            rd= req.getRequestDispatcher("subtraction");
            rd.forward(req,resp);
        } else if (operationType.equals("division")) {
            rd= req.getRequestDispatcher("division");
            rd.forward(req,resp);

        } else if (operationType.equals("multiplication")) {
            rd= req.getRequestDispatcher("multiplication");
            rd.forward(req,resp);
        }
    }
}

