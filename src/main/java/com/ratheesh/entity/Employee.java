package com.ratheesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_info")
public class Employee {

	@Id
	@Column(name = "Employee_Id")
	private Integer id;
	private String name;
	private String gender;
	private String companyName;
	private String Designation;
	private long phNo;
	
	public Employee() {
		
		
	}

	
	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", companyName=" + companyName
				+ ", Designation=" + Designation + ", phNo=" + phNo + "]";
	}


	public Employee(Integer id, String name, String gender, String companyName, String designation, long phNo) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.companyName = companyName;
		Designation = designation;
		this.phNo = phNo;
	}

	
	
	
	
}
