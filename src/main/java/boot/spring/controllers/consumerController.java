package boot.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import boot.spring.Entity.consumer;
import boot.spring.service.consumerServiceImplementation;
@RestController
public class consumerController {

	@Autowired
	consumerServiceImplementation consumerService; 
	@GetMapping("/consumer/all")
	public List<consumer> getConsumers(){
		System.out.println("In controller");
		return consumerService.findAllConsumers();
	}
	@PostMapping("/consumer/save")
	public consumer saveConsumers(@RequestBody consumer con){
		return consumerService.save(con);
	}
	
	
}
