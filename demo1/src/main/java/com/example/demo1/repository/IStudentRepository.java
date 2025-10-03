package com.example.demo1.repository;

import com.example.demo1.entity.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void add(Student student);
}
