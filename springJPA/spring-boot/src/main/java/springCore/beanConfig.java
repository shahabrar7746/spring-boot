package springCore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan(basePackages="springCore")  
public class beanConfig {

	public human Men() {
		System.out.println("im running !!");
	    return new  Men();
	}
}
