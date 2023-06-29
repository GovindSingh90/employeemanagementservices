package com.employee.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.dto.EmployeeDto;
import com.employee.management.service.EmployeeServiceimpl;

@RestController("/api")
//@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeServiceimpl employeeserviceimpl;

	@PostMapping("/Create")
	public void create(@RequestBody EmployeeDto employeeDto) {
		employeeserviceimpl.create(employeeDto);
	}

	@GetMapping("/all")
	public List<EmployeeDto> getAllEmployee() {
		return employeeserviceimpl.getEmployee();

	}

	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable int id) {
		System.out.println("delete the "+id);
		 employeeserviceimpl.deleteUserById(id);
		 
	}
}