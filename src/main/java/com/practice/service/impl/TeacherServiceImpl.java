package com.practice.service.impl;

import com.practice.dao.TeacherRepository;
import com.practice.model.Teacher;
import com.practice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public Teacher getTeacher(Integer id) {
        return teacherRepository.findById(id).get();
    }

    @Override
    public List<Teacher> getAllTeacher() {
        Iterable<Teacher> students = teacherRepository.findAll() ;

        List<Teacher> list = new ArrayList<>();
        students.iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }
}
