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

import dollarbank.models.Transaction;
import dollarbank.services.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService ts;
	
	@GetMapping("/{id}")
	public List<Transaction> getTransactions(@Valid @PathVariable int id) {
		return ts.getTransactions(id);
	}
	
	@PostMapping("/create")
	public void createTransaction(@Valid @RequestBody Transaction t) {
		ts.createTransaction(t);
	}
	
	@PutMapping("/update")
	public void updateTransaction(@Valid @RequestBody Transaction t) {
		ts.updateTransaction(t);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteTransaction(@Valid @PathVariable int id) {
		ts.deleteTransaction(id);
	}
}
