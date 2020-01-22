package com.amex.interview.hrs.error;

import com.amex.interview.hrs.constants.ErrorConstants;
import com.amex.interview.hrs.exception.ApiException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.persistence.EntityNotFoundException;

@RestControllerAdvice
public class CustomControllerExceptionHandler {
    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody ApiException handleNoHandlerFound(final NoHandlerFoundException e,
                                                           final WebRequest request) {
        return new ApiException(HttpStatus.NOT_FOUND,
                ErrorConstants.ENDPOINT_NOT_FOUND_MESSAGE,
                ErrorConstants.ENDPOINT_NOT_FOUND_ERROR_CODE);
    }

    @ExceptionHandler({EntityNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody ApiException handleNoEntityFoundException(final Exception exception,
                                                                   final WebRequest request) {
        return new ApiException(HttpStatus.NOT_FOUND,
                ErrorConstants.EMPLOYEE_NOT_FOUND_MESSAGE,
                ErrorConstants.EMPLOYEE_NOT_FOUND_ERROR_CODE);
    }

    @ExceptionHandler({DataIntegrityViolationException.class, NullPointerException.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody ApiException handleException(final Exception exception,
                                                      final WebRequest request) {
        return new ApiException(HttpStatus.INTERNAL_SERVER_ERROR,
                ErrorConstants.ENDPOINT_NOT_FOUND_MESSAGE,
                ErrorConstants.ENDPOINT_NOT_FOUND_ERROR_CODE);
    }
}
