package com.project.exoplanet.controllerAdvice;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.project.exoplanet.exceptions.ValueReturnMessageEventErro;

@RestControllerAdvice
public class ControllerAdivce {
	
	@ExceptionHandler(ValueReturnMessageEventErro.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErroReturn erroReturn(ValueReturnMessageEventErro ex, WebRequest request) {
 		
		ErroReturn erro = new ErroReturn(
				HttpStatus.NOT_FOUND.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
		return erro;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ErroReturn globalException(Exception ex, WebRequest request) {
		ErroReturn exceptionGlobal = new ErroReturn(
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
		return exceptionGlobal;
	}
}

