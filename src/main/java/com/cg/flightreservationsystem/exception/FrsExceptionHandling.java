package com.cg.flightreservationsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class FrsExceptionHandling {
	@ExceptionHandler(FRSException.class)
	public ResponseEntity<ErrorDetails> errorHandle(FRSException ex,WebRequest request){
		
		ErrorDetails details= new ErrorDetails(ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.BAD_REQUEST);

}
}