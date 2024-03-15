<%--
  Created by IntelliJ IDEA.
  User: veryg
  Date: 12/03/2024
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
if(session.getAttribute("userEmail").toString() ==null){
    response.sendRedirect("/video_management_war_exploded/login");
}
%>
<h2>Welcome on this page ${userEmail}</h2>
<h1>Hope that you are interested in posting videos here </h1>
<div>
    <form action="/video_management_war_explode/addVideo" method="post">
        <input name="title" placeholder="Enter the video title"/> <br>
        <input name="description" placeholder="Enter the video description"> <br>
        <input name="videoData"  type="file">
        <input type="submit" />
    </form>
</div>
</body>
</html>
