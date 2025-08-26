package com.sch.sprintboot.controller;

import com.sch.sprintboot.dto.Member;
import org.apache.catalina.Lifecycle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @GetMapping("/member")
    public String member(@ModelAttribute Member member,
                         Model model) {
        model.addAttribute("member", member);
        return "member";
    }
}
