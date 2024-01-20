package springCore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public interface human {
	 int getAge();
	 void setAge(int Age);
	 void setName(String Name);
	 String getName();
	 void setGender(String Gender);
	 String getGender();
	 void setisAdult(boolean isAdult);
	 boolean getisAdult();
	 private void bringTea() {
		System.out.println("Tea is Here !!"); 
	 }
	
}
