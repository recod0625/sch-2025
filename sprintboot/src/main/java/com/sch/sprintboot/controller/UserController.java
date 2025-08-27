package com.sch.sprintboot.controller;

import com.sch.sprintboot.dto.User;
import com.sch.sprintboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    //UserService userService = new UserService();      // 강한 결합(Tight Coupling)
    UserService userService;

    // 생성자를 통한 트슨한 결합(Loosen Coupling)
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // setter 메소드를 통한 트슨한 결합(Loosen Coupling)
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }



    @PostMapping("/login")
    public Map<String, Object> login(User user){   // @ModelAttribute 생략
        return userService.login(user);
    }

    @PostMapping("/signup")
    public Map<String, String> sighup(User user){  // @ModelAttribute 생략
        return userService.signup(user);
    }
}
