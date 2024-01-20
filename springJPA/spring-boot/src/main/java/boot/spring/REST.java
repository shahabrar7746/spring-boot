package boot.spring;
 
import java.sql.SQLException;
import java.util.HashMap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import springAOP.beanConfig;
import springAOP.dummy;
import springAOP.human;

@RestController
public class REST {
	 
	
	@GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody HashMap<String,human[]> test() {
		AnnotationConfigApplicationContext   context = 
		          new AnnotationConfigApplicationContext(beanConfig.class);
	             human
	             h =  (dummy) context.getBean(dummy.class);
	     	    h.setisAdult(true);
	     	       h.setAge(20);
	     	       h.setGender("male");
	     	       h.setName("Abrar");
	       human arr[] = new human[2];
	       arr[0] = h;
	       h =  (dummy) context.getBean(dummy.class);
		    h.setisAdult(true);
		       h.setAge(25);
		       h.setGender("male");
		       h.setName("Naffis");
		       arr[1] = h;
	       HashMap<String,human[]> map = new HashMap();
	       map.put("Abrar", arr);
		return map; 
			
	}
	
	@GetMapping( path = "/MajorProject/consumers", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public HashMap<String,Consumers> fetch() throws SQLException, ClassNotFoundException{
		return new Database().fetchConsumers();
	}
	@GetMapping("/apis/error")
	public String error() {
		return "error";
	}
	
	
}

