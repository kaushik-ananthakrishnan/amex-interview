# EmployeeControllerApi

All URIs are relative to *https://localhost:8080/hrs*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmployeeUsingGET**](EmployeeControllerApi.md#getEmployeeUsingGET) | **GET** /v1/employees/{id} | Find employee by id


<a name="getEmployeeUsingGET"></a>
# **getEmployeeUsingGET**
> Employee getEmployeeUsingGET(id)

Find employee by id

### Example
```java
// Import classes:
//import com.amex.interview.hrs.client.invoker.ApiException;
//import com.amex.interview.hrs.client.api.EmployeeControllerApi;


EmployeeControllerApi apiInstance = new EmployeeControllerApi();
Long id = 789L; // Long | id
try {
    Employee result = apiInstance.getEmployeeUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmployeeControllerApi#getEmployeeUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Employee**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

