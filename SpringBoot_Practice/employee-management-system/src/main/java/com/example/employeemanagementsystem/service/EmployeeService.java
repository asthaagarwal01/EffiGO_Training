package com.example.employeemanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.example.employeemanagementsystem.entity.EmployeeEntity;

public interface EmployeeService {
	List<EmployeeEntity> findAllEmployee();
	Optional<EmployeeEntity> findById(Long id);
	EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
	void deleteEmployee(Long id);
	
}
