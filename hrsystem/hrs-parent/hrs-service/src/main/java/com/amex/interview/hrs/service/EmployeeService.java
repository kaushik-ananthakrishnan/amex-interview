package com.amex.interview.hrs.service;

import com.amex.interview.hrs.constants.ErrorConstants;
import com.amex.interview.hrs.exception.ApiException;
import com.amex.interview.hrs.model.Employee;
import com.amex.interview.hrs.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    private static final ModelMapper modelMapper = new ModelMapper();

    public Employee getEmployee(Integer id){
        Employee employee = null;
        try{
           employee = modelMapper.map(employeeRepository.getOne(Long.valueOf(id)), Employee.class);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorConstants.EMPLOYEE_NOT_FOUND_MESSAGE, e);
        }
        return employee;
    }
}
