package com.tech.springWithElastic.services;

import com.tech.springWithElastic.entity.Book;
import com.tech.springWithElastic.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookServices {

    private static final Logger log = LoggerFactory.getLogger(BookServices.class);

    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book){
        log.info(book.toString());
        return bookRepository.save(book);
    }

    public Book findByAuthor(String author){
        Book reponse = bookRepository.findByAuthor(author);
        if (reponse!=null) {
            log.info(reponse.toString());
            return bookRepository.findByAuthor(author);
        }
        else {
            log.info("no result found with that author "+author);
            return null;
        }
    }
    public Object findAll(){
        Object response = bookRepository.findAll();
        log.info(response.toString());
       return response;
    }
    public void deleteAll(){
        log.info("all records are created from db");
        bookRepository.deleteAll();
    }
}
