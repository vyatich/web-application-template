package com.example.innopolis.repository.impl;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.entitiy.user.UserInfoDto;
import com.example.innopolis.repository.AbstractRepositoryImpl;
import com.example.innopolis.repository.EntityRepository;
import com.example.innopolis.repository.UserInfoRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserInfoRepositoryImpl extends AbstractRepositoryImpl<UserInfo> implements UserInfoRepository {

    private static final String TABLE_NAME = "user_info";
    private final String SELECT_ALL_DTOS = "SELECT new com.example.innopolis.entitiy.user.UserInfoDto(u.id, u.name) " +
            "FROM UserInfo u";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserInfoDto> getAllDtos() {
        return entityManager.createQuery(SELECT_ALL_DTOS).getResultList();
    }

    @Override
    public UserDetails getByUserName(String username) {
        return null;
    }

    @Override
    protected EntityRepository getRepository() {
        return this;
    }

    @Override
    protected String getTable() {
        return TABLE_NAME;
    }

    @Override
    protected Class<UserInfo> getEntityClass() {
        return UserInfo.class;
    }
}
