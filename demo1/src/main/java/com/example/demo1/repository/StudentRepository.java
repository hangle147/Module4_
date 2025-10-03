package com.example.demo1.repository;

import com.example.demo1.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "hang"));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }
}
