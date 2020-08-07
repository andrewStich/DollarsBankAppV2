package dollarbank.controllers;

import java.util.List;

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

import dollarbank.models.Account;
import dollarbank.services.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService as;
	
	@GetMapping("/{id}")
	public List<Account> getAccounts(@Valid @PathVariable int id) {
		return as.getAccounts(id);
	}
	
	@PostMapping("/create")
	public void createAccount(@Valid @RequestBody Account acct) {
		as.createAccount(acct);
	}
	
	@PutMapping("/update")
	public void updateAccount(@Valid @RequestBody Account acct) {
		as.updateAccount(acct);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteAccount(@Valid @RequestBody int id) {
		as.deleteAccount(id);
	}
}
