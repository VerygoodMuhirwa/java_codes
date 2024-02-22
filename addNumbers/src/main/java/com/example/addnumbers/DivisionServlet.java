package com.example.addnumbers;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DivisionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int firstnum = (int) req.getAttribute("firstnum");
        int secondnum= (int) req.getAttribute("secondnum");
        int division = firstnum/secondnum;
        PrintWriter out= resp.getWriter();
        out.println("The division of those numbers is " +division);
    }
}