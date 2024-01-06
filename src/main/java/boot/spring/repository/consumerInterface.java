package boot.spring.repository;

import org.springframework.stereotype.Repository;

import boot.spring.Entity.consumer;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface consumerInterface extends JpaRepository<consumer,Integer>{

}
