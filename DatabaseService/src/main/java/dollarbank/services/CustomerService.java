package dollarbank.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dollarbank.models.Customer;
import dollarbank.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	public Customer getCustomer(String userName) {
		return customerRepo.findByUserName(userName);
	}
	
	public void createCustomer(Customer cust) {
		customerRepo.save(cust);
	}
	
	public void updateCustomer(Customer cust) {
		customerRepo.save(cust);
	}
	
	public void deleteCustomer(int id) {
		customerRepo.deleteById(id);
	}
}
