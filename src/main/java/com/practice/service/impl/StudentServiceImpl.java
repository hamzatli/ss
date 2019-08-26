package com.practice.service.impl;

import com.practice.dao.StudentRepository;
import com.practice.model.Student;
import com.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudent(Integer id) {
        Optional<Student> st =  studentRepository.findById(id);

        return st.get();
    }

    @Override
    public List<Student> getAllStudent() {

        return studentRepository.findAll();
    }

    @Override
    public void addTeacher(Student student) {

        studentRepository.save(student);

    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
