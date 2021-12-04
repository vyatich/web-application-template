package com.example.innopolis.service.student;

import com.example.innopolis.entitiy.student.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    Student getById(Long id);

    void save(String name);
}
