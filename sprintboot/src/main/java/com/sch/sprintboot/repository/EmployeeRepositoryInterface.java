package com.sch.sprintboot.repository;

import com.sch.sprintboot.dto.Employee;
import java.util.List;

public interface EmployeeRepositoryInterface {
    List<Employee> selectAll();
    int insert(Employee employee);
}
