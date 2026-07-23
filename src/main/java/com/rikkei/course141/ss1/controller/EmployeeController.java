package com.rikkei.course141.ss1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.rikkei.course141.ss1.model.Employee;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @GetMapping
    public List<Employee> getAll() {
        return List.of(
            new Employee(1L, "Nguyen Van A", 1000.0),
            new Employee(2L, "Tran Thi B", 1200.0),
            new Employee(3L, "Le Van C", 1500.0)
        );
    }
}
