package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class BookService {

    private Map<Integer, Book> books = new HashMap<>();

    public Book addBook(Book book) {
        books.put(book.getId(), book);
        return book;
    }

    public Map<Integer, Book> getAllBook() {
        return books;
    }

    public Book updateBook(int id, Book book) {
        book.setId(id);
        books.put(id, book);
        return book;
    }

    public String deleteBook(int id) {
        books.remove(id);
        return "Book Deleted Successfully";
    }

    public List<Book> addBooks(List<Book> booksList) {
        for (Book book : booksList) {
            books.put(book.getId(), book);
        }
        return booksList;
    }

}