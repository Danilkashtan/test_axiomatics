package com.example.test_axiomatics.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CalculationExceptionController extends ResponseEntityExceptionHandler {
    @ExceptionHandler({CalculationException.class})
    public ResponseEntity<ErrorDto> handleNotFound(Exception e) {
        return new ResponseEntity<ErrorDto>(new ErrorDto(e.getLocalizedMessage()), HttpStatus.UNPROCESSABLE_ENTITY);
    }
}