<%--
  Created by IntelliJ IDEA.
  User: nathan
  Date: 2/16/24
  Time: 8:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int a= Integer.parseInt(request.getParameter("num1"));
    int b=Integer.parseInt(request.getParameter("num2"));
    int sum=a+b;
    out.println(" The sum is " + sum);
    Integer cons;

         cons = Integer.parseInt(config.getInitParameter("constant"));
        out.println("The pi is " + cons);
    String website= application.getInitParameter("website");
    out.println("Our website is "+ website);
%>
</body>
</html>
