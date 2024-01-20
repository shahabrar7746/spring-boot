package com.abrar.springJPA.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.abrar.springJPA.entities.guardian;
import com.abrar.springJPA.entities.student;
import com.abrar.springJPA.repository.studentRepo;

@SpringBootTest
//@DataJpaTest
public class studentServiceTest { 
	
	@Autowired
	private studentRepo service;
	
	
	
	//@Test
	public void save() {
		guardian g = new guardian();
		g.mail = "guardian3 implemented using embedded";
		g.name = "Guardian";
		g.number = "Something";
		student s = new student();
				       s.age = 90;
				     
				       s.name = "Salman Khan";
				       s.studentEmail = "dfgfdghd";
				       s.studentNumber = "545454";
				       s.Guardian = g;
				      
		 service.save(s);
	}
	//@Test
	public void getAll() {
	//	System.out.println(service.getAll());
	}
	
	//@Test
	public void findByName() {
	//	System.out.println(service.findByName("Salman Khan"));
	} 
	
	@Test// essential for testing applications.
	// helps in JUnit test executions.
	public void findBySequenceChar() {
		System.out.println(service.findByNameContaining("Ab"));
	}
	@Test
	public void findByGuardianName() {
		System.out.println(service.findByNameNotNull());
	}
	@Test
	public void findByIdLessThan() {
		System.out.println(service.findByIdLessThan(158));
	}
	@Test 
	public void getByEmail() {
		service.updateEmailById(158,"test");
		//System.out.println(service.updateEmailById(158));
		//System.out.println(service.getEmailById(157));
		//System.out.println(service.getEmailByIdUsingNativeQueries(157));
	}
	
	
	

}
