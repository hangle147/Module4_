package com.example.demo1.controller;

import com.example.demo1.entity.Student;
import com.example.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String showList(Model model) {
        model.addAttribute("studentList", studentService.findAll());
        return "student/list";
    }

    @GetMapping("/students/add")
    public String showFormAdd() {
        return "student/add";
    }

    @PostMapping("/students/add")
    public String save(@RequestParam(name = "id") int id,
                       @RequestParam(name = "name") String name,
                       Model model) {
        studentService.add(new Student(id, name));
        return "redirect:/students";
    }
}
