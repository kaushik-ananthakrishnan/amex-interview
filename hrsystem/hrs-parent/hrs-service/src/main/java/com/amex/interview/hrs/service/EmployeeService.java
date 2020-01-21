package com.amex.interview.hrs.service;

import com.amex.interview.hrs.entitiy.EmployeeEntity;
import com.amex.interview.hrs.model.Employee;
import com.amex.interview.hrs.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    private static final ModelMapper modelMapper = new ModelMapper();

    public Employee getEmployee(Long id){
        EmployeeEntity emp = employeeRepository.getOne(id);
        log.info("Employee Entity " + emp);
        Employee employee = modelMapper.map(emp, Employee.class);
        log.info("Employee DTO " + employee);
        return employee;
    }
}
