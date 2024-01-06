package springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")

public class Men implements human{
     
	
	private String name;
	private String gender;
	private int age;
	private boolean isAdult;
	
public String toString() {
	return name + " " + age + " " + gender + " isAdult->" + isAdult; 
}

@Override
public int getAge() {
	// TODO Auto-generated method stub
	return age;
}

@Override
public void setAge(int Age) {
	// TODO Auto-generated method stub
	age = Age;
}

@Override
public void setName(String Name) {
	// TODO Auto-generated method stub
	name = Name;
	
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return name;
}

@Override
public void setGender(String Gender) {
	// TODO Auto-generated method stub
	gender = Gender;
}

@Override
public String getGender() {
	// TODO Auto-generated method stub
	return gender;
}

@Override
public void setisAdult(boolean isAdult) {
	// TODO Auto-generated method stub
	this.isAdult = isAdult; 
}

@Override
public boolean getisAdult() {
	// TODO Auto-generated method stub
	return isAdult;
}
	
}
