package com.example.demoservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetServlet", value = "/GetServlet")
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // URL Rewriting

        String name;

        PrintWriter printWriter = response.getWriter();
        // client le pathako request bata aako xa
        name = request.getParameter("username");
        printWriter.println("Username: "+ name);

        String pwd = request.getParameter("pwd");
        printWriter.println("Password: "+ pwd);

        printWriter.println("<a href='WelServlet?myName=" + name + " ' > WelcomeServlet </a> ");

        printWriter.println("<form method='post' action='WelServlet'>");
        printWriter.println("<input type='text' value='"+name+"' name='hiddenName'>");
        printWriter.println("<input type='submit' value='submit' >\n");
        printWriter.println("</form>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter printWriter = response.getWriter();
//        // Hidden form field
//
//        String name = request.getParameter("username");
//
//        printWriter.println("<form method='post' action='WelServlet'>");
//        printWriter.println("<input type='text' value='"+name+"' name='hiddenName' >");
//
//        printWriter.println("<input type='submit' value='submit' >\n");
//
//        printWriter.println("</form>");


    }
}
