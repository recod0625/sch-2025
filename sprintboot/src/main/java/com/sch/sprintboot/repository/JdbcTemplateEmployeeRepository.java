package com.sch.sprintboot.repository;

import com.sch.sprintboot.dto.Employee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcTemplateEmployeeRepository implements EmployeeRepositoryInterface {
    // DB 연동 및 생성
    private List<Employee> list = new ArrayList<Employee>();
    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplateEmployeeRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Employee> selectAll() {
        String sql = "SELECT sno, name, address, department, edate FROM employee";
        return jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Employee.class));
    }

    @Override
    public int insert(Employee employee) {
        String sql = "insert into employee(sno, name, address, department, edate) VALUES (?, ?, ?, ?, now())";
        int rows = jdbcTemplate.update(sql, employee.getSno(), employee.getName(), employee.getDepartment(), employee.getAddress());
        return rows;
    }
}
