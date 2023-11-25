package com.ratheesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratheesh.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
}
