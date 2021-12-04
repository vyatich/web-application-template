package com.example.innopolis.controller;

import com.example.innopolis.entitiy.student.Student;
import com.example.innopolis.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("student/")
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping()
    public String getAll(Model model) {
        List<Student> studentList = service.getAll();
        model.addAttribute("students", studentList);
        return "students";
    }

    @GetMapping("{id}")
    public String getById(Model model, @PathVariable long id) {
        Student student = service.getById(id);
        model.addAttribute("student", student);
        return "students";
    }

    @PostMapping()
    public String save(Model model,
                       @RequestParam(name = "name") String name) {
        service.save(name);
        return "redirect: students/";
    }
}
