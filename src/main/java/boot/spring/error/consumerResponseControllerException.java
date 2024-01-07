package boot.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import boot.spring.Entity.consumer;
import boot.spring.Entity.errorMessage;

@ControllerAdvice
@ResponseStatus

public class consumerResponseControllerException extends ResponseEntityExceptionHandler{

	@ExceptionHandler(consumerErrors.class)
	public ResponseEntity<errorMessage> throwError(consumerErrors error,WebRequest req){
		errorMessage message = new errorMessage(error.getStatus(),error.getMessage());
		return ResponseEntity.status(error.getStatus()).body(message);
	}
	
	
	
	
}
