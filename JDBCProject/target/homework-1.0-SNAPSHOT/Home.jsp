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
    <title>Home</title>
</head>
<body>
<%
    String username = (String) session.getAttribute("username");
    if(username == null){
        response.sendRedirect("Login.jsp");
    } else {
        response.getWriter().println("<h2>Welcome " + username + "</h2>");
    }
%>
<a href="Logout.jsp">Çık</a>
</body>
</html>
