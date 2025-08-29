package com.sch.sprintboot.repository;

import com.sch.sprintboot.entity.Member;

import java.util.List;

public interface MemberRepositoryInterface {
    String delete(Long sno);
    String insert(Member member);
    List<Member> findAll();
}
