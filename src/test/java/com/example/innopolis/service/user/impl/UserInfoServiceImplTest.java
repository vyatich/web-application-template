package com.example.innopolis.service.user.impl;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.repository.impl.UserInfoRepositoryImpl;
import com.example.innopolis.service.user.UserInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@SpringBootTest
class UserInfoServiceImplTest {

    @Autowired
    private UserInfoService service;

    @MockBean
    private UserInfoRepositoryImpl userInfoRepository;

    @Test
    void getById() {
        UserInfo expected = new UserInfo();
        expected.setId(1L);
        expected.setName("Вася");
        expected.setUserName("Vasya");
        expected.setPassword("Vasya");
        Mockito.when(userInfoRepository.getById(1L)).thenReturn(expected);

        UserInfo userInfo = service.getById(1L);

        Assertions.assertNotNull(userInfo);
        Assertions.assertEquals(1L, userInfo.getId());
    }

    @Test
    void getAllDtos() {
    }

    @Test
    void getAll() {
        Mockito.when(userInfoRepository.getAll()).thenReturn(Collections.emptyList());

        List<UserInfo> all = service.getAll();

        Assertions.assertTrue(all.isEmpty());
        verify(userInfoRepository, atLeastOnce()).getAll();
    }

    @Test
    void loadUserByUsername() {
    }
}