package com.academy.service;

import com.academy.model.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        Book book = new Book("Сияние", 1977);
        Book book1 = new Book("Мастер и Маргарита", 1928);
        Book book2 = new Book("1Q84, Haruki Murakami", 2009);

        books.add(book);
        books.add(book1);
        books.add(book2);

        return books;
    }
}