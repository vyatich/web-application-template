package com.example.innopolis.service.user.impl;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.entitiy.user.UserInfoDto;
import com.example.innopolis.repository.UserInfoRepository;
import com.example.innopolis.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService, UserDetailsService {

    private final UserInfoRepository userInfoRepository;

    @Autowired
    public UserInfoServiceImpl(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public UserInfo getById(long id) {
        return null;
    }

    @Override
    public List<UserInfoDto> getAllDtos() {
        return userInfoRepository.getAllDtos();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userInfoRepository.getByUserName(username);
    }
}
