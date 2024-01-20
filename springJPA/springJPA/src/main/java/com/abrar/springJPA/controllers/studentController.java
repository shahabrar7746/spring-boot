package com.abrar.springJPA.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abrar.springJPA.entities.student;
import com.abrar.springJPA.service.studentService;



@RestController

public class studentController {
	
	
	@Autowired
	private studentService service;
	
	@GetMapping("/students")
	public List<student> getAll(){
		return service.getAll();
	}
	
	@PostMapping("/student/save")
	public student save(@RequestBody student s){
		return service.addStudent(s);
	}
	
	@GetMapping("/")
	public ResponseEntity status(){
		return ResponseEntity.accepted().body("Im up");
	}
	
}
