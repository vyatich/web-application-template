package com.example.innopolis.service.user.impl;

import com.example.innopolis.entitiy.user.User;
import com.example.innopolis.repository.UserRepository;
import com.example.innopolis.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getById(long id) {
        return null;
    }
}
