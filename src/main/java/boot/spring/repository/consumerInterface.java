package boot.spring.repository;

import org.springframework.stereotype.Repository;

import boot.spring.Entity.consumer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface consumerInterface extends JpaRepository<consumer,Integer>{
	 public List<consumer> findBypincode(String pinCode);
}
