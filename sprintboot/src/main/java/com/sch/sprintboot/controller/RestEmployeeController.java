package com.sch.sprintboot.controller;

import com.sch.sprintboot.dto.Employee;
import com.sch.sprintboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class RestEmployeeController {
    EmployeeService employeeService;

    // React --> 사원등록
    @PostMapping("/employees/register")
    public String employeeRegister(@RequestBody Employee employee){
        return employeeService.register(employee);
    }

    @GetMapping("/employees")
    public List<Employee> employeeList(){
        return employeeService.findAll();
    }

    @Autowired
    public RestEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/register")
    public String register(@ModelAttribute Employee employee) {
        return employeeService.register(employee);
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Employee> list = employeeService.findAll();
        model.addAttribute("list", list);
        return "employeeList";
    }
}


