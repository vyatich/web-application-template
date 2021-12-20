package com.example.innopolis.service.user;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.entitiy.user.UserInfoDto;

import java.util.List;

public interface UserInfoService {

    UserInfo getById(long id);

    List<UserInfoDto> getAllDtos();

    List<UserInfo> getAll();
}
