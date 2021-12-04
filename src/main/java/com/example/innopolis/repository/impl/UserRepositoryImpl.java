package com.example.innopolis.repository.impl;

import com.example.innopolis.entitiy.user.User;
import com.example.innopolis.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void getAll() {

    }

    @Override
    public User getById(Long id) {
        return null;
    }
}
