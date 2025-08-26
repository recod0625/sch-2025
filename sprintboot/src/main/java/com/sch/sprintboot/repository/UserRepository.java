package com.sch.sprintboot.repository;

import com.sch.sprintboot.dto.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    public Map<String, String> signup(User user){
        Map<String,String> result = new HashMap<>();

        result.put("id", user.getId());
        result.put("pass", user.getPass());
        result.put("name", user.getName());
        result.put("email", user.getEmail());

        return result;
    }

    public Map<String, Object> login(User user) {
        String did = "test";
        String dpass = "test1";
        Map<String, Object> result = new HashMap<String, Object>();

        if (user.getId().equals(did) && user.getPass().equals(dpass)) {
            result.put("status", "success");
            result.put("message", "로그인 성공!");
            result.put("id", user.getId());
        } else {
            result.put("status", "fail");
            result.put("message", "로그인 실패!");
            result.put("id", user.getId());
        }
        return result;
    }
}
