package com.tech.springWithElastic.controllers;

import com.tech.springWithElastic.entity.Book;
import com.tech.springWithElastic.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookServices bookServices;

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookServices.addBook(book);
    }
    @GetMapping("/{author}")
    public Book getBookByAuthor(@PathVariable String author){
        return bookServices.findByAuthor(author);
    }
    @GetMapping
    public Object getAllBooks(){
        return bookServices.findAll();
    }
    @DeleteMapping
    public void deleteAll(){
        bookServices.deleteAll();
    }
}
