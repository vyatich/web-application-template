package com.example.innopolis.repository;

import com.example.innopolis.entitiy.user.User;

public interface UserRepository {

    void getAll();

    User getById(Long id);
}
