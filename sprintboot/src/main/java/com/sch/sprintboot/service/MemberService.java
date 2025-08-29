package com.sch.sprintboot.service;

import com.sch.sprintboot.repository.JpaDwitterRepository;
import com.sch.sprintboot.repository.JpaMemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sch.sprintboot.entity.Member;

import java.util.List;

@Service
@Transactional
public class MemberService {
    private JpaMemberRepository memberRepository;

    @Autowired
    public MemberService(JpaMemberRepository memberRepository, JpaDwitterRepository jpaDwitterRepository) {
        this.memberRepository = memberRepository;
    }

    public String delete(Long sno) {
        return memberRepository.delete(sno);
    }


    public String save(Member member) {
        return memberRepository.insert(member);
    }

    public List<Member> list(){
        return memberRepository.findAll();
    }
}
