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
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username != null && password != null && username.equals("godoro") && password.equals("java")){
        session.setAttribute("username", username);
        response.sendRedirect("Home.jsp");
    } else if(username != null || password != null) {
        response.getWriter().println("<p>Incorrect username or password.</p>");
    }
%>

<form method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
