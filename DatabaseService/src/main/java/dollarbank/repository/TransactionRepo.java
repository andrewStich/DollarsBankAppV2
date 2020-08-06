package dollarbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dollarbank.models.Transaction;

@Repository
public interface TransactionRepo extends CrudRepository<Transaction, Integer>{

	@Query(value = "select * from transactions where customer_trans_id = ?", nativeQuery = true)
	public List<Transaction> getTransById(int id);
	
}
