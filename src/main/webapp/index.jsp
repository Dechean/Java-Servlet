<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%-- this is expression tag--%>
<h1><%= "Hello World!" %>
</h1>
<br/>
<%--this is scriplet tag--%>
<% out.println("Hello Dechean"); %>
<a href="hello-servlet">Hello Servlet</a>
<h5></h5>
<form method="post" action="hello-servlet">

    <input type="text" name="username" placeholder="Enter name">
    <input type="password" name="pwd" placeholder="Enter password">
    <input type="radio" name="gender"  value="male"> Male
    <input type="radio" name="gender"  value="female"> Female

    <select name="location" id="loc">
        <option value="KTM">KTM</option>
        <option value="Pokhara">Pokhara</option>
        <option value="Mustang">Mustang</option>
    </select>

    <input type="checkbox" name="hobby" value="Cooking">Cooking
    <input type="checkbox" name="hobby" value="Music">Music
    <input type="checkbox" name="hobby" value="Dance">Dance



    <input type="submit" value="submit" >



</form>





</body>
</html>