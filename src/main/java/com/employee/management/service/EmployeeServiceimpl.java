package com.employee.management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.dto.EmployeeDto;
import com.employee.management.entity.EmployeeEntity;
import com.employee.management.repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeServiceinterface {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void create(EmployeeDto employeeDto) {

		EmployeeEntity employee = new EmployeeEntity();

		employee.setEmpName(employeeDto.getEmpName());
		employee.setEmpsal(employeeDto.getEmpsal());
		employee.setEmpDoj(employeeDto.getEmpDoj());
		employee.setEmpregination(employeeDto.getEmpregination());
		employee.setEmpdesignation(employeeDto.getEmpdesignation());
		employeeRepository.save(employee);

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeDto> getEmployee() {
		List<EmployeeEntity> empList = employeeRepository.findAll();

		List<EmployeeDto> elist = new ArrayList<EmployeeDto>();

		for (EmployeeEntity e : empList) {
			EmployeeDto edto = new EmployeeDto();
			edto.setEmpid(e.getId());
			edto.setEmpName(e.getEmpName());
			edto.setEmpsal(e.getEmpsal());
			edto.setEmpDoj(e.getEmpDoj());
			edto.setEmpdesignation(e.getEmpdesignation());
			edto.setEmpregination(e.getEmpregination());

			elist.add(edto);

		}
		return elist;

	}

	@Override
	public void deleteUserById(int id) {
		employeeRepository.deleteById(id);
		 
		

}
}
