<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/28/2022
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Session</title>
</head>
<body>

<%
  PrintWriter printWriter = response.getWriter();
  if(session != null){
    String name = (String) session.getAttribute("myName");
    printWriter.println("Hello from session " + name);

  }
  else {
    response.sendRedirect("form.jsp");
    printWriter.println("Invalid password");
  }

%>

<a href="ProfileServlet">
  Profile
</a>
<a href="DashboardServlet">
  Dashboard
</a>

<form action="LogoutServlet" method="post">
  <input type="submit" value="Logout">

</form>

</body>
</html>
