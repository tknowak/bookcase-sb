package com.keyworld.rest;

import com.keyworld.dto.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @GetMapping
    public List<BookDto> getBooks() {
        return List.of(
                new BookDto("Harry Potter", "JK Rowling", 600),
                new BookDto("To Kill a Mockingbird", "Harper Lee", 300),
                new BookDto("The godfather", "Mario Puzo", 500)
        );
    }
}
