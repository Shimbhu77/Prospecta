package com.service.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	@ExceptionHandler(CategoryException.class)
	public ResponseEntity<ErrorDetails> myExceptionHandler(CategoryException pe , WebRequest req)
	{
		ErrorDetails err  = new ErrorDetails();
		err.setDescription(req.getDescription(false));
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(pe.getMessage());
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> myExceptionHandler(Exception pe , WebRequest req)
	{
		ErrorDetails err  = new ErrorDetails();
		err.setDescription(req.getDescription(false));
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(pe.getMessage());
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> myExceptionHandler(MethodArgumentNotValidException pe)
	{
		ErrorDetails err  = new ErrorDetails();
		err.setDescription(pe.getFieldError().getDefaultMessage());
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(pe.getMessage());
		
		return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
		
	}
	
}
