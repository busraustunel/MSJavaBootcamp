<%--
  Created by IntelliJ IDEA.
  User: busraustunel
  Date: 17.04.2023
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Logout</title>
</head>
<body>
<%
    session.setAttribute("username", null);
    response.sendRedirect("Login.jsp");
%>
</body>
</html>
