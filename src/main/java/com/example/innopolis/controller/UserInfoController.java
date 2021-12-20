package com.example.innopolis.controller;

import com.example.innopolis.entitiy.user.UserInfo;
import com.example.innopolis.entitiy.user.UserInfoDto;
import com.example.innopolis.service.user.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "user/")
public class UserInfoController {

    private final UserInfoService userInfoService;

    @Autowired
    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }


    @GetMapping()
    public String getAllDtos(Model model) {
        List<UserInfoDto> allDtos = userInfoService.getAllDtos();
        model.addAttribute("userShortInfo", allDtos);
        return "user";
    }

    @GetMapping("all/")
    public String getAll(Model model) {
        List<UserInfo> all = userInfoService.getAll();
        model.addAttribute("userInfo", all);
        return "user";
    }

    @GetMapping("{id}")
    public UserInfo getById(@PathVariable long id) {
        return userInfoService.getById(id);
    }

    @PostMapping("login")
    public String auth(@RequestParam(value = "error", required = false) String error,
                       @RequestParam(value = "logout", required = false) String logout,
                       Model model) {
        model.addAttribute("error", error != null);
        model.addAttribute("logout", logout != null);
        return "login";
    }

    @PostMapping("/logout")
    public String logout(Model model) {
        UserInfo userInfo = (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "redirect: /user/" + userInfo.getId();
    }
}
