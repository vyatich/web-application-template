package com.example.innopolis.service.student.impl;

import com.example.innopolis.entitiy.animal.Animal;
import com.example.innopolis.repository.AnimalRepository;
import com.example.innopolis.service.student.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }


    @Override
    public List<Animal> getAll() {
        return animalRepository.getAll();
    }

    @Override
    public Animal getById(Long id) {
        return animalRepository.getById(id);
    }

    @Override
    public void save(String name) {
        if(name.isEmpty()) {
            return;
        }
        Animal animal = new Animal();
        animal.setName(name);
        animalRepository.save(animal);
    }

    private void validateFileds(Animal animal) {

    }
}
