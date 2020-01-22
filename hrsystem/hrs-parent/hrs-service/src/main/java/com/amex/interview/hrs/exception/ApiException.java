package com.amex.interview.hrs.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

@Data
public class ApiException{
    private HttpStatus status;
    private String message;
    private int code;
    private List<String> errors;

    public ApiException(HttpStatus status, String message, List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ApiException(HttpStatus status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        errors = Arrays.asList(error);
    }

    public ApiException(HttpStatus status, String message, int code) {
        super();
        this.status = status;
        this.message = message;
        this.code = code;
    }
}
