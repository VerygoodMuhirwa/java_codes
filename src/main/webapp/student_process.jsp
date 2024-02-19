<%--
  Created by IntelliJ IDEA.
  User: edouard
  Date: 2024-02-19
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="StudentBean" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    StudentBean st = new StudentBean();
    st.setStudId("st003");
    st.setFname("Edouard");
    st.setLname("Sibomana");
    request.setAttribute("student", st);
    jakarta.servlet.RequestDispatcher rd = request.getRequestDispatcher("afterAll.jsp");
    rd.forward(request, response);
%>
</body>
</html>