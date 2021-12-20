package com.example.innopolis.repository;

import com.example.innopolis.entitiy.user.UserInfoDto;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserInfoRepository extends EntityRepository {

    List<UserInfoDto> getAllDtos();

    UserDetails getByUserName(String username);
}
