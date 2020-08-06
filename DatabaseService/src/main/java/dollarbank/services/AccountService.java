package dollarbank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dollarbank.models.Account;
import dollarbank.repository.AccountRepo;

@Service
public class AccountService {

	@Autowired
	AccountRepo accountRepo;
	
	public List<Account> getAccounts(int id) {
		return accountRepo.findByCutomerId(id);
	}
	
	public void createAccount(Account acct) {
		accountRepo.save(acct);
	}
	
	public void updateAccount(Account acct) {
		accountRepo.save(acct);
	}
	
	public void deleteAccount(int id) {
		accountRepo.deleteById(id);
	}
}
