package com.sch.sprintboot.service;

import com.sch.sprintboot.dto.Employee;
import com.sch.sprintboot.repository.JdbcTemplateEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final JdbcTemplateEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(JdbcTemplateEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public int register(Employee employee) {
        return employeeRepository.insert(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.selectAll();
    }

}
