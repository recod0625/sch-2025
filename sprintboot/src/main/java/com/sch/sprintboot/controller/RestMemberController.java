package com.sch.sprintboot.controller;

import com.sch.sprintboot.service.MemberService;
import org.springframework.web.bind.annotation.*;
import com.sch.sprintboot.entity.Member;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3001")
public class RestMemberController {
    private MemberService memberService;

    public RestMemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/members/register")
    public String registerMember(@RequestBody Member member) {
        return memberService.save(member);
    }

    @GetMapping("/members")
    public List<Member> getMembers() {
        return memberService.list();
    }
}
