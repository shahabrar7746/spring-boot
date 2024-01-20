package springAOP;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
public static void main(String args[]) {
	AnnotationConfigApplicationContext   context = 
	          new AnnotationConfigApplicationContext(beanConfig.class);
             human h =  (dummy) context.getBean(dummy.class);
    h.setisAdult(true);
       h.setAge(20);
       h.setGender("male");
       h.setName("Abrar");
      
       human h2 =  (dummy) context.getBean(dummy.class);

      // human h2 = context.getBean(Men.class);
       System.out.println(h2 + " " +  h);
            //System.out.println(h);
}
}
