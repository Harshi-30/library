package com.lms.library.service;

import com.lms.library.model.Book;
import com.lms.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//@Service
public class BookService {
    private BookRepository bookRepo;
    @Autowired
    private LoggingService loggingService;

    @Autowired
    public void setBookRepo(BookRepository bookRepo){
    loggingService.log("inside constracter");
        this.bookRepo = bookRepo;
    }
    public List<Book> saveMethod(List<Book> books){
        List<Book> finalBook = new ArrayList<>();
        for(Book book : books){
            if(book.getCount() > 0){
                finalBook.add(book) ;
            }
        }
        return bookRepo.saveAll(finalBook);
    }
    public Book getBookById(String id) {
        List<Book> books = bookRepo.findAll();
        Book cBook = null;
        for (Book book : books) {
            if (id.equals(book.getId())) {
                cBook = book;
            }
        }
        return cBook;
    }

}

