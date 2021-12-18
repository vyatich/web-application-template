package com.example.innopolis.repository.impl;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.entitiy.user.UserInfoDto;
import com.example.innopolis.repository.UserInfoRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserInfoRepositoryImpl implements UserInfoRepository {

    private final String SELECT_ALL_DTOS = "SELECT new com.example.innopolis.entitiy.user.UserInfoDto(u.id, u.name) " +
            "FROM UserInfo u";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserInfoDto> getAllDtos() {
        return entityManager.createQuery(SELECT_ALL_DTOS).getResultList();
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
