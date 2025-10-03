package com.example.demo1.service;

import com.example.demo1.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void add(Student student);
}
