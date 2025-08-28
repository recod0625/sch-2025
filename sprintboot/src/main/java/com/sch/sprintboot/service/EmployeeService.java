package com.sch.sprintboot.service;

import com.sch.sprintboot.dto.Employee;
import com.sch.sprintboot.repository.JdbcTemplateEmployeeRepository;
import com.sch.sprintboot.repository.JpaEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EmployeeService {
    //private final JdbcTemplateEmployeeRepository employeeRepository;

    /*
    @Autowired
    public EmployeeService(JdbcTemplateEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    */

    private final JpaEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(JpaEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public int register(Employee employee) {
        return employeeRepository.insert(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.selectAll();
    }

}
