package com.ratheesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ratheesh.entity.Employee;
import com.ratheesh.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public String upsert(Employee emp) {
		 empRepo.save(emp);
		 
		 return "Success";
		 
	}

	@Override
	public Employee findById(Integer id) {
		Optional<Employee> byId = empRepo.findById(id);
		if(byId.isPresent()) {
			
			return byId.get();
			}
		return null;
		
	}

	@Override
	public String deleteById(Integer id) {
	     
	     if(empRepo.existsById(id)) {
	    	 
	    	 empRepo.deleteById(id); 
	    	 return "Record Deleted";
	     }else {
		return "Record not found";
	}}
	

	@Override
	public List<Employee> getAll() {
		
		return empRepo.findAll();
	}

}
