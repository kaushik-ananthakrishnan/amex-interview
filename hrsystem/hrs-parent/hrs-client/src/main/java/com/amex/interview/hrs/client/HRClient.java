package com.amex.interview.hrs.client;

import com.amex.interview.hrs.generated.api.EmployeeControllerApi;
import com.amex.interview.hrs.generated.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class HRClient {
    @Autowired
    private EmployeeControllerApi employeeControllerApi;

    public Employee getEmployeeById(Long id){
        return employeeControllerApi.getEmployeeUsingGET(id);
    }
}
