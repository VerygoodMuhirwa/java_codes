<%--
  Created by IntelliJ IDEA.
  User: veryg
  Date: 12/03/2024
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Login form</h1>
<div>
    <form action="/video_management_war_exploded/loginUser" method="post">
        <input name="email" placeholder="Enter your email "/>
        <input name="password" placeholder="Enter the password"/>
        <input type="submit">
    </form>
</div>
</body>
</html>
