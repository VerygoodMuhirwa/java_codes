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
<%
String name= request.getParameter("urname");
out.println("Welcome using scriptlet" + name);
%>

</body>
Welcome using EL, ${param.urname}
</html>
