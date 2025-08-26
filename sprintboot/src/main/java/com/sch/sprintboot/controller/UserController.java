package com.sch.sprintboot.controller;

import com.sch.sprintboot.dto.User;
import com.sch.sprintboot.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    UserService userService = new UserService();

    @PostMapping("/login")
    public Map<String, Object> login(User user){   // @ModelAttribute 생략
        return userService.login(user);
    }

    @PostMapping("/signup")
    public Map<String, String> sighup(User user){  // @ModelAttribute 생략
        return userService.signup(user);
    }
}
