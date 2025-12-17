package com.lms.library.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id

    String id ;
    String name;
    String authorName;
    int count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Book(String id, String name, String authorName ,int count){
    this.id = id;
    this.name = name;
    this.authorName = authorName;
    this.count = count;
    }

    public Book(){}

}
