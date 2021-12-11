package com.example.innopolis.service.student;

import com.example.innopolis.entitiy.animal.Animal;

import java.util.List;

public interface AnimalService {

    List<Animal> getAll();

    Animal getById(Long id);

    void save(String name);
}
