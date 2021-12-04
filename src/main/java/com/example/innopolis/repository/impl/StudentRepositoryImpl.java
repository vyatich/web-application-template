package com.example.innopolis.repository.impl;

import com.example.innopolis.entitiy.student.Student;
import com.example.innopolis.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> getAll() {
        return entityManager.createQuery("select id, name from Student").getResultList();
    }

    @Override
    public Student getById(Long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }
}
