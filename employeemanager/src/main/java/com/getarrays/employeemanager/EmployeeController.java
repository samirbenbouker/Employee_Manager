package com.getarrays.employeemanager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getarrays.employeemanager.model.Employee;
import com.getarrays.employeemanager.service.EmployeeService;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	// Endpoint path/all return all employee in database
	@GetMapping
	public String getMessageAPI() {
		return "WELCOME TO EMPLOYEES API DEVELOPED BY SAMIR BEN BOUKER";
	}
	
	// Endpoint path/all return all employee in database
	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployee();
	}
	
	// Endpoint path/find/{id} pass the for employee and return this employee
	@GetMapping("/find/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long id) {
		return employeeService.findEmployeeById(id);
	}
	
	// Add new employee in database
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	// Update employee in database
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	// Delete employee in database using id employee
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@RequestBody Long id) {
		return "USER BY ID: " + id + " DELETED";
	}
	
}
