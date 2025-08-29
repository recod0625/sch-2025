package com.sch.sprintboot.repository;

import com.sch.sprintboot.entity.Dwitter;

import java.util.List;

public interface DwitterRepositoryInterface {
    String delete(Long id);
    List<Dwitter> findAll();
    String insert(Dwitter diwtter);
}
