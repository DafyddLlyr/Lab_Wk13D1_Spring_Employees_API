package com.codeclan.example.employees.controllers;

import com.codeclan.example.employees.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codeclan.example.employees.repositories.EmployeeRepository;

import java.util.List;


@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> findAllEmployees() {
       return employeeRepository.findAll();
    }
}
