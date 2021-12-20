package com.example.innopolis.repository.impl;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.repository.UserInfoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest(includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Repository.class))
@Sql({"/db-unit/drop_schema.sql", "/db-unit/create_schema.sql", "/db-unit/user_info.sql"})
public class UserInfoRepositoryImplTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    void getById_WhenCorrect_ShouldReturn() {
        UserInfo userInfo = userInfoRepository.getById(1L);

        Assertions.assertNotNull(userInfo);
    }
}