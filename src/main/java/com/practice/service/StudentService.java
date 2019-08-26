package com.practice.service;

import com.practice.model.Student;

import java.util.List;

public interface StudentService {

    Student getStudent(Integer id);

    List<Student> getAllStudent();

    void addTeacher(Student student);

    void deleteStudent(Integer id);

}
