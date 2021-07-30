package com.mobiquity.atm.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

//@RestControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler
{
	/*
	 * @ExceptionHandler({ JsonMappingException.class,
	 * JsonProcessingException.class, Exception.class }) public
	 * ResponseEntity<Error> handleAllExceptions(final HttpServletRequest req, final
	 * Exception exp) { Error error = null; HttpStatus status = null; if(exp
	 * instanceof JsonMappingException || exp instanceof JsonProcessingException) {
	 * error = new Error("500", exp.getMessage(), "JSON format Exception"); status =
	 * HttpStatus.INTERNAL_SERVER_ERROR; } else if(exp instanceof Exception) { error
	 * = new Error("500", exp.getMessage(), "Internal server error"); status =
	 * HttpStatus.INTERNAL_SERVER_ERROR; }
	 * 
	 * return new ResponseEntity<>(error, status); }
	 */
}
