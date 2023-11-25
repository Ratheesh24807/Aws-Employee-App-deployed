package com.ratheesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ratheesh.entity.Employee;
import com.ratheesh.service.EmployeeServiceImpl;

@RestController
public class EmployeeRest {

	@Autowired
	private EmployeeServiceImpl empServ;

	@PostMapping("/addEmp")
	public ResponseEntity<String> upsert(@RequestBody Employee emp) {

		String status = empServ.upsert(emp);

		return new ResponseEntity<>(status, HttpStatus.ACCEPTED);

	}


	@GetMapping("/find/{id}")
	public ResponseEntity<Employee> find(@PathVariable Integer id){
		
		Employee emp = empServ.findById(id);
		
		return new ResponseEntity<>(emp,HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		
		String status = empServ.deleteById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
		
		
		
	}
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> all(){
		
		List<Employee> all = empServ.getAll();
		
		return new ResponseEntity<>(all, HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Employee emp) {

		String status = empServ.upsert(emp);

		return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
	
	
	
}
	
}
