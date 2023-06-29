package com.employee.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	Integer id;
	@Column(name = "name")
	String empName;
	@Column(name = "salary")
	String empsal;
	@Column(name = "doj")
	String empDoj;
	@Column(name = "regination")
	String empregination;
	@Column(name = "designation")
	String empdesignation;

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

	@Override
	public String toString() {
		return "EmployeeEntity [empid=" + id + ", empName=" + empName + ", empsal=" + empsal + ", empDoj=" + empDoj
				+ ", empregination=" + empregination + ", empdesignation=" + empdesignation + "]";
	}

}
