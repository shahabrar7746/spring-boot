package boot.spring.controllers;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import boot.spring.Entity.*;
import boot.spring.error.departmentNotFoundException;
import boot.spring.service.*;
import ch.qos.logback.classic.Logger;
import jakarta.validation.Valid;


@RestController
public class departmentController {
	private Logger LOGGER = (Logger) LoggerFactory.getLogger(departmentController.class);
	@Autowired
	DepartmentService service;
	
	
	@GetMapping("/departments")
	public List<Department> department() {
		LOGGER.info("Client is using /departments");
		
		return service.findAll();
	}
	@PostMapping("/save/Department")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("Client is using /save/departments");
		return service.saveDepartment(department);
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartment(@PathVariable("id") Integer id ) {
		LOGGER.info("Client is using /departments/{id}");
		return service.getDepartment(id);
	}
	
	@DeleteMapping("/department/{id}")
	public Department deleteDepartment(@PathVariable("id") Integer id) throws departmentNotFoundException {
		return service.deleteDepartment(id);
	}
	
	@PutMapping("department/{id}")
	public Department updateDepartment(@PathVariable("id") Integer id, @RequestBody Department department) {
		return service.updateDepartment( id, department);
	}
	@GetMapping("/department/name/{departmentName}")
	public List<Department> getDepartmentByName(@PathVariable("departmentName") String deptName) {
		return service.getDepartmentByName(deptName);
	}
	
	
	
	
	
	
	


}
