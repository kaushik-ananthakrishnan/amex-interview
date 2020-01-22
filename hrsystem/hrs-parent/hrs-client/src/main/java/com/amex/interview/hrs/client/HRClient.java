package com.amex.interview.hrs.client;

import com.amex.interview.hrs.client.api.EmployeeControllerApi;
import com.amex.interview.hrs.client.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HRClient {
    private final EmployeeControllerApi employeeControllerApi = new EmployeeControllerApi();
    public Employee getEmployeeById(Integer id){
        return employeeControllerApi.getEmployeeUsingGET(id);
    }
}
