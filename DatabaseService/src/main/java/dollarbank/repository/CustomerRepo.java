package dollarbank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dollarbank.models.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {
	
	public Customer findByUserName(String userName);
}
