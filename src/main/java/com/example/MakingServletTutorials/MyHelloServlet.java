package com.example.MakingServletTutorials;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
//content type
//https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types

@WebServlet(name = "MyHelloServlet", urlPatterns = "/hello")
public class MyHelloServlet extends HttpServlet {
    //(1) init() - called once.

    //(2) service() - whenever request made it create thread for each request. All thread talking to one class.
    //      doGet()
    //      doPut()
    //      doPost()
    //      doDelete()

    //(3) destroy() - called once.
//   Note:
//   Servlet is not thread safe. do not declare global variable inside servlet

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("The GET request has been made to /hello");

/*      //content type
        response.setContentType("text/plain");

        //response
        response.getWriter().println("Here is a line");
        response.getWriter().println("Here is another line");*/

/*      //content type
        response.setContentType("text/html");

        //response
        response.getWriter().println("<h1>Hello!</h1>");
        response.getWriter().println("<p> Welcome to my website</p>");*/

        //content type
        response.setContentType("text/plain");

        //response
        response.getWriter().println("<h1>Hello!</h1>");
        response.getWriter().println("<p> Welcome to my website</p>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("The POST request has been made to /hello");

    }
}
