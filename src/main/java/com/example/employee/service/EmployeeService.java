package com.example.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;

@Service
public class EmployeeService {
	
	Employee emp;
	
	List<Employee> employeeList = new ArrayList<>();
	 
	public List<Employee> getAllEmployees() {
		
		 return employeeList;
	}
	
	public Employee saveEmployee(Employee e) {
		Employee emp = new Employee();
		emp.setFirstName(e.getFirstName());
		emp.setLastName(e.getLastName());
		emp.setEmail(e.getEmail());
		employeeList.add(emp);
		return emp;
		
	}

}
