package com.academy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    public LogoutServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        System.out.println("Session before invalidate: "+ request.getSession(false));

        request.getSession(false).invalidate();

        System.out.println("Session after invalidate: "+ request.getSession(false));

        out.println("Thank you! You are successfully logged out. Refresh the page");
        out.close();
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
    }
}