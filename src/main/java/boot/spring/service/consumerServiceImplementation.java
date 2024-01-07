package boot.spring.service;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import boot.spring.Entity.consumer;
import boot.spring.error.consumerErrors;
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
	public consumer save(consumer con) throws consumerErrors {
		// TODO Auto-generated method stub
		if(con.date.isBlank() || con.email.isBlank() || con.location.isBlank() || con.name.isBlank() || con.pincode.isBlank()) {
			
			 throw new consumerErrors("Improper Json data");
		}
		 consumerRepo.save(con);
		return con;
	}
	public consumer deleteById(int id) throws consumerErrors {
		Optional<consumer> cons = consumerRepo.findById(id);
	      if(!cons.isPresent()) {
	    	  throw new consumerErrors("Invalid consumer id ",HttpStatus.NOT_FOUND);
	      }
		 consumerRepo.deleteById(id);
		 return cons.get();
	}

	@Override
	public List<consumer> findByPinCode(String pinCode) throws consumerErrors {
		// TODO Auto-generated method stub
		List<consumer> list = consumerRepo.findBypincode(pinCode);
		if(list.size() == 0) {
			throw new consumerErrors("Invalid Pin Code !",HttpStatus.NOT_FOUND);
		}
		
		return list;
	}
	public long numberOfEntity(){
		return consumerRepo.count();
	}

}
