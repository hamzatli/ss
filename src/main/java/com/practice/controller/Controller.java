package com.practice.controller;

import com.practice.model.Student;
import com.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class Controller {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> get() {

       List<Student> list = studentService.getAllStudent();


        return studentService.getAllStudent();
    }

}
