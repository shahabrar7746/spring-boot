package boot.spring.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import boot.spring.Entity.errorMessage;



@ControllerAdvice // defines destination claas for exceptions that is occuring at Controllers
@ResponseStatus //defines return type of the class 
public class RestResponseControllerException extends ResponseEntityExceptionHandler{
 
	@ExceptionHandler(departmentNotFoundException.class)// defines type of Exception below method handles
	public ResponseEntity<errorMessage> departmentNotFound(departmentNotFoundException exception, WebRequest req){
		errorMessage error = new errorMessage(HttpStatus.NOT_FOUND,exception.getMessage());// makes an structure of an error message.
		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		
	}
}
