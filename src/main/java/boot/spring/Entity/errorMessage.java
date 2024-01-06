package boot.spring.Entity;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class errorMessage {
      public HttpStatus status;
      public String message;
      public errorMessage(HttpStatus status,String message){
    	  this.status = status;
    	  this.message = message;
      }
}
