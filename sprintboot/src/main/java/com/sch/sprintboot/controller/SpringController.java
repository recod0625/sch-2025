package com.sch.sprintboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringController {
    @GetMapping("/spring")
    public String spring(@RequestParam("name") String name,
                         @RequestParam("age") int age,
                         Model model) {
        System.out.println(name); // 서버 콘솔에 출력
        System.out.println(age);
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "spring";
    }
}
