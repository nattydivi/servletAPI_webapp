package com.academy;

import com.academy.model.entity.User;
import com.academy.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = new User(login, password);

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<meta charset=\"UTF-8\">");
        writer.println("</head>");
        writer.println("<body>");

        LoginService loginService = new LoginService();

        if (loginService.checkCredentials(login, password)) {

            writer.println("Привет " + login + "!");
            writer.println("<br>\n" +
                    "        <a href=\"/booksJsp\">Доступные книги</a>");

            HttpSession session = req.getSession();

            session.setAttribute("user", user);

            Cookie cookie = new Cookie("login", login);
            cookie.setMaxAge(100000);
            Cookie cookie1 = new Cookie("password", password);

            resp.addCookie(cookie);
            resp.addCookie(cookie1);

        } else {
            writer.println("You entered incorrect data");
            writer.println("<br>\n" +
                    "        <a href=\"/loginForm\">try again</a>");
        }
        writer.println("</body>");
        writer.println("</html>");
    }
}