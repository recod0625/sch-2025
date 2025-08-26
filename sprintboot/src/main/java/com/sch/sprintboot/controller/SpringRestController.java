package com.sch.sprintboot.controller;

import com.sch.sprintboot.dto.Member;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController {

    //@ResponseBody 생략가능 <-- @RestController
    @GetMapping("/spring-api")
    public Member springApi(){
        Member member = new Member();
        member.setName("홍길동");
        member.setAge(30);
        member.setAddress("서울시");
        member.setSubject("스프링부트");

        return member;
    }
}
