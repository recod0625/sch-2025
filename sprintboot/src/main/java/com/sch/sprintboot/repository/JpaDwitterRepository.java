package com.sch.sprintboot.repository;

import com.sch.sprintboot.entity.Dwitter;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaDwitterRepository implements DwitterRepositoryInterface {
    private final EntityManager em;

    @Autowired
    public JpaDwitterRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public String delete(Long id) {
        Dwitter findDwitter = em.find(Dwitter.class, id);
        if (findDwitter != null) {
            em.remove(findDwitter);
        }
        return "ok";
    }

    @Override
    public List<Dwitter> findAll() {
        return em.createQuery("select m from Dwitter m", Dwitter.class).getResultList();
    }

    @Override
    public String insert(Dwitter diwtter) {
        em.persist(diwtter);
        return "ok";
    }
}
