package com.example.innopolis.repository;

import java.util.List;

public interface AbstractRepository<T> {

    List<T> getAll();

    T getById(Long id);
//
//    void update(T t);
//
//    void delete(T t);
}
