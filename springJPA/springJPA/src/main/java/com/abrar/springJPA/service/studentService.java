package com.abrar.springJPA.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abrar.springJPA.entities.student;
import com.abrar.springJPA.repository.studentRepo;

@Service
public class studentService {
  
	
	
	
	@Autowired
	private studentRepo repo;
	
	public student addStudent(student s) {
		repo.save(s);
		System.out.println(s);
		return s;
	}
	public List<student> getAll(){
		return repo.findAll();	
		}
	public List<student> findByName(String name){
		return repo.findByName(name);
	}
	public List<student> findBychar(String ch){
		return repo.findByNameContaining(ch);
	}
	
	
	
}
