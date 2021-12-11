package com.example.innopolis.repository;

import com.example.innopolis.entitiy.animal.Animal;

import java.util.List;

public interface AnimalRepository {

    List<Animal> getAll();

    Animal getById(Long id);

    void save(Animal animal);
}
