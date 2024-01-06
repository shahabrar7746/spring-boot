package boot.spring.service;

import java.util.List;

import boot.spring.Entity.consumer;

public interface serviceInterface {
 public List<consumer> findAllConsumers();
 public consumer save(consumer con);
}
