package com.employee.management.service;

import java.util.List;

import com.employee.management.dto.EmployeeDto;

public interface EmployeeServiceinterface {
	public void create(EmployeeDto employeeDto);

	public void update();

	public List<EmployeeDto> getEmployee();

	public void deleteUserById(int id) ;

}
