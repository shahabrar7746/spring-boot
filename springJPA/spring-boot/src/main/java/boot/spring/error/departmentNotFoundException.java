package boot.spring.error;

public class departmentNotFoundException extends Exception{
	
	public departmentNotFoundException() {
     
    }
	 public departmentNotFoundException(String message) {
	        super(message);
	    }
	 public departmentNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
	 public departmentNotFoundException(Throwable cause) {
	        super(cause);
	    }
	 protected departmentNotFoundException(String message, Throwable cause,
             boolean enableSuppression,
             boolean writableStackTrace) {
super(message, cause, enableSuppression, writableStackTrace);
}
}
