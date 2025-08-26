package com.sch.sprintboot.service;

import com.sch.sprintboot.dto.User;
import com.sch.sprintboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    UserRepository userRepository = new UserRepository();

    public Map<String, Object> login(User user) {
        UserRepository userRepository = new UserRepository();
        return userRepository.login(user);
    }


    public Map<String, String> signup(User user) {
        return userRepository.signup(user);
    }
}
