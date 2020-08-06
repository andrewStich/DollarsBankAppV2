package dollarbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dollarbank.models.Account;

@Repository
public interface AccountRepo extends CrudRepository<Account, Integer> {

	@Query(value = "select * from acounts where customer_id = ?", nativeQuery = true)
	public List<Account> findByCutomerId(int id);
}
