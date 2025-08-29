package com.sch.sprintboot.repository;

import com.sch.sprintboot.entity.Member;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaMemberRepository implements MemberRepositoryInterface {
    private EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    public String delete(Long sno) {
        Member findMember = em.find(Member.class, sno);
        if (findMember != null) {
            System.out.println(sno + "삭제됨");
            em.remove(findMember);
        }
        return "ok";
    }

    @Override
    public String insert(Member member) {
        em.persist(member);
        return member.getName();
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }
}
