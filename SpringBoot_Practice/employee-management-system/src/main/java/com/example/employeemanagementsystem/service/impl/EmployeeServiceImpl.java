package com.example.employeemanagementsystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.dto.mapper.EmployeeMapper;
import com.example.employeemanagementsystem.dto.request.EmployeeRequest;
import com.example.employeemanagementsystem.dto.response.EmployeeResponse;
import com.example.employeemanagementsystem.entity.EmployeeEntity;
import com.example.employeemanagementsystem.repository.EmployeeRepository;
import com.example.employeemanagementsystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

	

	/*@Override
	public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntity = EmployeeMapper.MAPPER.fromRequestToEntity(employeeRequest);
        employeeRepository.save(employeeEntity);
        return EmployeeMapper.MAPPER.fromEntityToResponse(employeeEntity);
	}

	@Override
	public EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id) {
		// TODO Auto-generated method stub
		 Optional<EmployeeEntity> checkExistingEmployee = findById(id);
	        if (! checkExistingEmployee.isPresent())
	            throw new RuntimeException("Employee Id "+ id + " Not Found!");

	        EmployeeEntity employeeEntity = EmployeeMapper.MAPPER.fromRequestToEntity(employeeRequest);
	        EmployeeMapper.MAPPER.fromEntityToResponse(employeeEntity).setId(id);
	        employeeRepository.save(employeeEntity);
	        return EmployeeMapper.MAPPER.fromEntityToResponse(employeeEntity);
	}*/

}
