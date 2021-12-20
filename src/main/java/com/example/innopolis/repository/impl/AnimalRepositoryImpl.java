package com.example.innopolis.repository.impl;

import com.example.innopolis.entitiy.animal.Animal;
import com.example.innopolis.repository.AnimalRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@SuppressWarnings("unchecked")
public class AnimalRepositoryImpl implements AnimalRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Animal> getAll() {
        List<Animal> list = entityManager.createQuery("select a from Animal a", Animal.class)
                .getResultList();
        return list;
    }

    @Override
    public Animal getById(Long id) {
        return (Animal) entityManager.createQuery("SELECT id, name FROM Animal WHERE id = :id")
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void save(Animal animal) {

    }
}
