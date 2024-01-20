package boot.spring.service;

import java.util.List;

import boot.spring.Entity.consumer;
import boot.spring.error.consumerErrors;
//consmers
public interface serviceInterface {
 public List<consumer> findAllConsumers();
 public consumer save(consumer con) throws consumerErrors;
 public consumer deleteById(int id) throws consumerErrors ;
 public List<consumer> findByPinCode(String pinCode) throws consumerErrors;
 public long numberOfEntity();
}
