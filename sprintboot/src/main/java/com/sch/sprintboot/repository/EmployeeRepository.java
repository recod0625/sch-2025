package com.sch.sprintboot.repository;

import com.sch.sprintboot.dto.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private List<Employee> list = new ArrayList<Employee>();

    public String insert(Employee employee) {
        String result = "";
        if(list.add(employee)){
            result ="success";
        }
        else {
            result ="fail";
        }
        return result;
    }

    public List<Employee> selectAll() {
        return list;
    }
}
