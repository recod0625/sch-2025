package com.sch.sprintboot.controller;

import com.sch.sprintboot.dto.Member;
import jakarta.annotation.Resource;
import org.apache.catalina.Lifecycle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {
    @ResponseBody
    @PostMapping("/member-api")
    public Member mem(@ModelAttribute("member") Member member){
        return member;
    }

    @PostMapping("/member")
    public String memberPost(@ModelAttribute("member") Member member,
                             Model model){
        System.out.println("Post");
        model.addAttribute("member",member);
        return "member";
    }
    @GetMapping("/member")
    public String member(@ModelAttribute Member member,
                         Model model) {
        System.out.println("Get");
        model.addAttribute("member", member);
        return "member";
    }
}
