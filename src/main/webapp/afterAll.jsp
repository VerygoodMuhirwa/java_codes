<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="StudentBean" %>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
<h1>Student Information</h1>
<ul>
    <% StudentBean student= (StudentBean) request.getAttribute
    <li>Student ID: ${student.getStudId()}</li>
    <li>First Name: ${student.getFname()}</li>
    <li>Last Name: ${student.getLname()}</li>
    %>
</ul>
</body>
</html>