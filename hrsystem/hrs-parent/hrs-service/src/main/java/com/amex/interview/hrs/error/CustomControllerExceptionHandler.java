package com.amex.interview.hrs.error;

import com.amex.interview.hrs.constants.ErrorConstants;
import com.amex.interview.hrs.exception.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class CustomControllerExceptionHandler {
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody ApiException handleNoHandlerFound(NoHandlerFoundException e, WebRequest request) {
        return new ApiException(HttpStatus.NOT_FOUND, ErrorConstants.ENDPOINT_NOT_FOUND_MESSAGE, ErrorConstants.ENDPOINT_NOT_FOUND_ERROR_CODE);
    }
}
