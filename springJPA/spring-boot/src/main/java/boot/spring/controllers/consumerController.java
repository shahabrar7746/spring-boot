package boot.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import boot.spring.Entity.consumer;
import boot.spring.error.consumerErrors;
import boot.spring.service.consumerServiceImplementation;
@RestController
public class consumerController {

	@Autowired
	consumerServiceImplementation consumerService; 
	@GetMapping("/all/consumer")
	public List<consumer> getConsumers(){

		return consumerService.findAllConsumers();
	}
	@PostMapping("/save/consumer")
	public consumer saveConsumers(@RequestBody consumer con) throws consumerErrors{
		return consumerService.save(con);
	}
	@DeleteMapping("/delete/consumer/{id}")
	public consumer deleteConsumer(@PathVariable("id") int id) throws consumerErrors {
		return consumerService.deleteById( id);
	}
	@GetMapping("/consumer/{pincode}")
	public List<consumer> getByPinCode(@PathVariable("pincode") String pinCode) throws consumerErrors{
		return consumerService.findByPinCode(pinCode);
	}
	@GetMapping("/")
	public long numberOfEntity() {
		return consumerService.numberOfEntity();
	}
	
	
	
}
