package com.lms.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
    @Id
    private String rollNo;
    private String firstName;
    private String   lastName;
    private String email;
    private String course;
    private String batch;

    public Student(String batch, String course, String email, String firstName, String lastName, String rollNo) {

        this.batch = batch;
        this.course = course;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
    }
    public Student(){}

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }


    public  void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
