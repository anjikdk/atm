package com.mobiquity.atm.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalCustomException extends ResponseEntityExceptionHandler
{
	@ExceptionHandler({
		DataNotFoundException.class, 
		Exception.class
	})
	public ResponseEntity<CustomError> handleAllExceptions(final HttpServletRequest req, final Exception exp)
	{
		CustomError error = null;
		HttpStatus status = null;
		if(exp instanceof DataNotFoundException)
		{
			error = new CustomError(exp.getMessage(), HttpStatus.NOT_FOUND.value());
			status = HttpStatus.NOT_FOUND;
		}
		else if(exp instanceof Exception)
		{
			error = new CustomError(exp.getMessage(), HttpStatus.BAD_REQUEST.value());
			status = HttpStatus.BAD_REQUEST;
		}
		
		return new ResponseEntity<>(error, status);
	}
}
