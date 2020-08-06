package dollarbank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dollarbank.models.Transaction;
import dollarbank.repository.TransactionRepo;

@Service
public class TransactionService {

	@Autowired
	TransactionRepo transRepo;
	
	public List<Transaction> getTransactions(int id) {
		return transRepo.getTransById(id);
	}
	
	public void createTransaction(Transaction trans) {
		transRepo.save(trans);
	}
	
	public void updateTransaction(Transaction trans) {
		transRepo.save(trans);
	}
	
	public void deleteTransaction(int id) {
		transRepo.deleteById(id);
	}
}
