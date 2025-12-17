package com.lms.library.config;

import com.lms.library.repository.BookRepository;
import com.lms.library.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public BookService bookService(){
        return new BookService();
    }
}
