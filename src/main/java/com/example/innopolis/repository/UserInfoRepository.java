package com.example.innopolis.repository;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.entitiy.user.UserInfoDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserInfoRepository {

    List<UserInfoDto> getAllDtos();

    UserInfo getById(Long id);

    UserDetails getByUserName(String username);
}
