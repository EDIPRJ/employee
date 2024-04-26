package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee e)
    {
        return employeeService.saveEmployee(e);
    }
 
    @GetMapping("/employees")
 
    public List<Employee> fetchEmployees()
    {
        return employeeService.getAllEmployees();
    }

}
