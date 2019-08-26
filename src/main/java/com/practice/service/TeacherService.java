package com.practice.service;

import com.practice.model.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher getTeacher(Integer id);

    List<Teacher> getAllTeacher();

    void addTeacher(Teacher teacher);

    void deleteTeacher(Integer id);

}
