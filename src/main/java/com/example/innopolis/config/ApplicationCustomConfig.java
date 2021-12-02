package com.example.innopolis.config;

import com.example.innopolis.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ApplicationCustomConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserService getService() {
        return null;
    }
}
