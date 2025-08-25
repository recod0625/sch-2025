package com.sch.sprintboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        //hello.html view에게 데이터 전달 --> ModelAndView -> Model(줄임)
        model.addAttribute("msg", "홍길동"); // key and value
        return "hello"; //view name msg="홍길동"
    }

    @GetMapping("/spring-mvc")
    public String springMvc(Model model) {
        model.addAttribute("msg", "홍길동 친구");
        return "spring-mvc";
    }
}
