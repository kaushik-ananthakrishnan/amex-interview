/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amex.interview.hrs.client.api;

import com.amex.interview.hrs.client.model.Employee;
import org.junit.Ignore;
import org.junit.Test;

/**
 * API tests for EmployeeControllerApi
 */
@Ignore
public class EmployeeControllerApiTest {

    private final EmployeeControllerApi api = new EmployeeControllerApi();

    
    /**
     * Find employee by id
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEmployeeUsingGETTest() {
        Integer id = null;
        Employee response = api.getEmployeeUsingGET(id);

        // TODO: test validations
    }
    
}
