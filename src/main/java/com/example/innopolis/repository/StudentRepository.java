package com.example.innopolis.repository;

import com.example.innopolis.entitiy.student.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> getAll();

    Student getById(Long id);

    void save(Student student);
}
