<%--
  Created by IntelliJ IDEA.
  User: veryg
  Date: 19/02/2024
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="recieve-data.jsp">
    Your name <input name="urname">
    <input type="submit" >
    <h3>Student data</h3>
    student Id: ${requestScope.student.studId} <br>
    student Firstname: ${requestScope.student["fname"]} <br>
</form>
</body>
</html>
