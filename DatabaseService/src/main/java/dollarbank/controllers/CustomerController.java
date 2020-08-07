package dollarbank.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dollarbank.models.Customer;
import dollarbank.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	@GetMapping("/{username}/{password}")
	public Customer getCustomer(@Valid @PathVariable String username, @Valid @PathVariable String password) {
		Customer cust = cs.getCustomer(username);
		if(cust.getPassword().equals(password)) {
			return cust;
		} else {
			return null;
		}
	}
	
	@PostMapping("/create")
	public void createCustomer(@Valid @RequestBody Customer cust) {
		cs.createCustomer(cust);
	}
	
	@PutMapping("/update")
	public void updateCustomer(@Valid @RequestBody Customer cust) {
		cs.updateCustomer(cust);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCustomer(@Valid @PathVariable int id) {
		cs.deleteCustomer(id);
	}
}
