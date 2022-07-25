package com.example.demoservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WelServlet", urlPatterns = "/WelServlet")
public class WelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();
        String name = request.getParameter("myName");
//        String name = request.getParameter("name");
        printWriter.println("Hello from "+ name);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();
//        String name = request.getParameter("hiddenName");
//        printWriter.println("Hello from "+ name);


        HttpSession session = request.getSession(false);

//        if(session != null){
//            String name = (String) session.getAttribute("myName");
//            printWriter.println("Hello from session " + name);
//
//        }


    }
}
