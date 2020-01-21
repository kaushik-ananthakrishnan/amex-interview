package com.amex.interview.hrs.controller;

import com.amex.interview.hrs.entitiy.EmployeeEntity;
import com.amex.interview.hrs.model.Employee;
import com.amex.interview.hrs.service.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="/{id}", produces = "application/json")
    @ApiOperation(value = "Find employee by id", response = Employee.class)
    public Employee getEmployee(@PathVariable(value = "id") Long employeeId)
    {
        return employeeService.getEmployee(employeeId);
    }
}
