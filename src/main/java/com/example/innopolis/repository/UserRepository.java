package com.example.innopolis.repository;

import com.example.innopolis.entitiy.user.UserInfo;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository {

    void getAll();

    UserInfo getById(Long id);

    UserDetails getByUserName(String username);
}
