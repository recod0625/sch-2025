package com.sch.sprintboot.service;

import com.sch.sprintboot.dto.Employee;
import com.sch.sprintboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public String register(Employee employee) {
        return employeeRepository.insert(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.selectAll();
    }

}
