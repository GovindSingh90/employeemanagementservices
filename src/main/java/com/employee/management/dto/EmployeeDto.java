package com.employee.management.dto;

public class EmployeeDto {
	int empid;
	String empName;
	String empsal;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpsal() {
		return empsal;
	}
	public void setEmpsal(String empsal) {
		this.empsal = empsal;
	}
	String empDoj;
	String empregination;
	String empdesignation;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpDoj() {
		return empDoj;
	}
	public void setEmpDoj(String empDoj) {
		this.empDoj = empDoj;
	}
	public String getEmpregination() {
		return empregination;
	}
	public void setEmpregination(String empregination) {
		this.empregination = empregination;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}

}
