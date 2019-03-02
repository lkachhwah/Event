package com.example.event.controller;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.event.exception.ServiceException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static Logger logger = Logger.getLogger(GlobalExceptionHandler.class.getName());

	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="invalid cotegories and location")
	@ExceptionHandler(ServiceException.class)
	public void handleIOException(){
		logger.severe("Invalid categories and location");
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason="Somethhing wrong in the application")
	@ExceptionHandler(Exception.class)
	public void handleException(){
		logger.severe("Somethhing wrong in the application");
	}
}
