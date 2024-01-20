package springCore;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
public static void main(String args[]) {
	AnnotationConfigApplicationContext   context = 
	          new AnnotationConfigApplicationContext(beanConfig.class);
       human h = (Men) context.getBean(Men.class);
       h.setisAdult(true);
       h.setAge(20);
       h.setGender("male");
       h.setName("Abrar");
       human h2 = context.getBean(human.class);
       System.out.println(h2 + " " +  h);
}
}
