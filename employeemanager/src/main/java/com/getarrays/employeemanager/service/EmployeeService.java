package com.getarrays.employeemanager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getarrays.employeemanager.exception.UserNotFoundException;
import com.getarrays.employeemanager.model.Employee;
import com.getarrays.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	// Save a new Employee in database
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}
	
	// Return all Employees in database
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	// Update Employee in database
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	// Find Employee by id in database
	public Employee findEmployeeById(Long id) {
		return employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}
	
	// Delete Employee in database
	public void deleteEmployee(Long id) {
		employeeRepository.deleteEmployeeById(id);
	}
	
}
