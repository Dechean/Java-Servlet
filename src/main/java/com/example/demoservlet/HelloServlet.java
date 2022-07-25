package com.example.demoservlet;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {

//        message = "Hello World!";



    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        // server le pathako
        PrintWriter out  = resp.getWriter();

        // client le pathako request bata aako xa
        String name = req.getParameter("username");
        out.println("Username: "+ name);

        String pwd = req.getParameter("pwd");
        out.println("Password: "+ pwd);

        String gender = req.getParameter("gender");
        out.println("Gender: "+ gender);

        String location = req.getParameter("location");
        out.println("Location: "+ location);

//        multiple values
        String[] hobby = req.getParameterValues("hobby");
        if(hobby != null){
            for (String str: hobby) {
                out.println("Hobby: "+ str);
                System.out.println("Hobby: "+ str);
            }
        }



//        out.println( hobby);

        System.out.println("Username: "+ name);
        System.out.println("Password: "+ pwd);
        System.out.println("Gender: "+ gender);
        System.out.println("Location: "+ location);
//        System.out.println("Hobby: "+ hobby);



        // if password matches
        // Request Dispatcher

        if(pwd.equals("java")){
//            System.out.println("Successfully login...");
            // Cookie
            // creating cookie object
            Cookie cookie = new Cookie("name", name);
            // adding cookie to browser
            resp.addCookie(cookie);

            // delete cookie after 2 secs
            cookie.setMaxAge(2);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WelcomeServlet");
            requestDispatcher.forward(req, resp);

        }

        else {
//            System.out.println("Password not matched..");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req, resp);
            out.println("Invalid password");
        }





    }

    public void destroy() {
    }
}