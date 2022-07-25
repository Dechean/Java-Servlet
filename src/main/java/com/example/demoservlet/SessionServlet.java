package com.example.demoservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SessionServlet", urlPatterns = "/SessionServlet")
public class SessionServlet extends HttpServlet {

    // session creating

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        // client le pathako request bata aako xa
        String name = request.getParameter("username");
        printWriter.println("Username: "+ name);

        String pwd = request.getParameter("pwd");
        printWriter.println("Password: "+ pwd);

        if(pwd.equals("java")){
            HttpSession session = request.getSession(true);
            session.setAttribute("myName", name);

            //timeout value for an individual session = 20 secs

//            if(session.isNew() ){
                session.setMaxInactiveInterval(20);

//            }

//            response.sendRedirect("form.jsp");



//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("WelServlet");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("session.jsp");

            requestDispatcher.forward(request, response);
        }

        else {
//            System.out.println("Password not matched..");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.include(request, response);
            printWriter.println("Invalid password");
        }



    }
}
