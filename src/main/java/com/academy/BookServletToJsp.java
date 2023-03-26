package com.academy;

import com.academy.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/booksJsp")
public class BookServletToJsp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        var bookService = new BookService();

        var books = bookService.getBooks();

        req.setAttribute("books", books);

        req.getRequestDispatcher("/WEB-INF/jsp/book.jsp").forward(req, resp);
    }
}