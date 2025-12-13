package com.lms.library.controller;

import com.lms.library.model.Student;
import com.lms.library.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @PostMapping("/student/signUp")
    public void saveStudent(@RequestBody Student student){

        Student fstudent = getStudentById(student.getRollNo());
        if(fstudent == null){
            studentRepository.save(student);
        }else {
            System.out.println("student already exists");
        }
    }

    @GetMapping("/student/{rollNo}")
    public Student  getStudentById(@PathVariable("rollNo") String rollNo){
        Student fStudent = null ;
       List<Student> students = studentRepository.findAll();
       for(Student student : students){
           if(rollNo .equals(student.getRollNo())){
               fStudent = student;
           }
       }
       return fStudent;
    }


}
