package com.sch.sprintboot.repository;

import com.sch.sprintboot.dto.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class JpaEmployeeRepository implements EmployeeRepositoryInterface {
    private final EntityManager em;

    public JpaEmployeeRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public int insert(Employee employee) {
        em.persist(employee);
        return employee.getSno();
    }

    @Override
    public List<Employee> selectAll() {
        return em.createQuery("select m from Employee m", Employee.class).getResultList();
    }
}
