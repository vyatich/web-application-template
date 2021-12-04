package com.example.innopolis.service.student.impl;

import com.example.innopolis.entitiy.student.Student;
import com.example.innopolis.repository.StudentRepository;
import com.example.innopolis.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.getById(id);
    }

    @Override
    public void save(String name) {
        Student student = new Student();
        student.setName(name);
        studentRepository.save(student);
    }
}
