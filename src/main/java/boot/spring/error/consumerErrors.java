package boot.spring.error;

import org.springframework.http.HttpStatus;


public class consumerErrors extends Exception{

	public consumerErrors(String message) {
		super(message);
	}
	public consumerErrors(String message,HttpStatus status) {
		super(message);
		this.status = status;
		
		
	}
	
	
	private HttpStatus status = HttpStatus.BAD_REQUEST;
	public HttpStatus getStatus() {
		return status;
	}
}

