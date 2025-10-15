package com.learning.mongoDB.service;

import com.learning.mongoDB.dto.EmployeeDto;
import com.learning.mongoDB.entity.Employee;
import com.learning.mongoDB.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;

    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee entity = modelMapper.map(employeeDto, Employee.class);
        Employee savedEntity = employeeRepository.save(entity);
        return modelMapper.map(savedEntity, EmployeeDto.class);
    }
}
