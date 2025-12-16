package com.lms.library.service;

import com.lms.library.model.Book;
import com.lms.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookService {
    private BookRepository bookRepo;
    @Autowired
    public void setBookRepo(BookRepository bookRepo){
        System.out.println("inside constr..");
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

}
