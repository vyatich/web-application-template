package com.example.innopolis.repository.impl;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void getAll() {

    }

    @Override
    public UserInfo getById(Long id) {
        return null;
    }

    @Override
    public UserDetails getByUserName(String username) {
        return null;
    }
}
