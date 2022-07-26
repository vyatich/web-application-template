package com.example.innopolis.repository;

import com.example.innopolis.entitiy.animal.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataJpaExample extends JpaRepository<Animal, Long> {
}
