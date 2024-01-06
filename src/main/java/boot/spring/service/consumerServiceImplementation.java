package boot.spring.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.spring.Entity.consumer;
import boot.spring.repository.consumerInterface;


@Service
public class consumerServiceImplementation implements serviceInterface {
	@Autowired
	private consumerInterface consumerRepo;

	@Override
	public List<consumer> findAllConsumers() {
		// TODO Auto-generated method stub
		return consumerRepo.findAll();
	}

	@Override
	public consumer save(consumer con) {
		// TODO Auto-generated method stub
		return consumerRepo.save(con);
	}

}
