package com.lms.library.controller;

import com.lms.library.model.Book;
import com.lms.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/books")
    public void saveBook(@RequestBody List<Book> books ){
        bookRepository.saveAll(books);
    }

    @GetMapping("/books/{id}")
    public Book getBookById (@PathVariable("id") String id){
       List<Book> books = getBook();
       Book cBook = null;

       for(Book book:books){


           if(id.equals(book.getId()) ){
               cBook = book;
           }
       }
       return cBook;
    }

    @GetMapping("/books")
    public List<Book> getBooks (){
        System.out.println("inside /books");
        List<Book> books = getBook();
        return books;
    }
    private List<Book> getBook(){
        return bookRepository.findAll();
    }
    @GetMapping("/bookByCount/{count}")
    public List<Book> getBookByCount(@PathVariable("count") int count){

        if (count < 0){
            System.out.println("count of books should be positive");
            throw new RuntimeException("count of books should be positive");
        }

        List<Book> result = new ArrayList<>();
        for(Book cbook : getBook()){
            if(count == cbook.getCount()){
                result.add(cbook);
            }
        }
        return result;
    }
}
