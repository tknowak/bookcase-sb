package com.keyworld.web;

import com.keyworld.entity.Book;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bookcase")
public class BookResource {

    @RequestMapping(value = "/books",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks() {
        Book book1 = new Book("Harry Potter", 10000);
        Book book2 = new Book("Akademia Pana Kleksa", 50);
        Book book3 = new Book("Biografia Jarosława Kaczyńskiego", 500);
        List<Book> bookcase = new ArrayList<>();
        bookcase.add(book1);
        bookcase.add(book2);
        bookcase.add(book3);
        return bookcase;
    }
}
