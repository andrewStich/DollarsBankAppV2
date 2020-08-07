package dollarbank.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "transactions", catalog = "dollarsbank")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@NotNull
	private int id;

	@NotNull
	@Column(name = "customer_trans_id")
	private int customerTransId;

	@NotNull
	@Column(name = "acct_trans_id")
	private int accountTransId;

	@NotNull
	@Column(name = "amount")
	private float amount;

	@NotNull
	@Column(name = "start_balance")
	private float startBalance;

	@NotNull
	@Column(name = "end_balance")
	private float endBalance;

	@NotNull
	@Column(name = "type")
	private String type;

	@NotNull
	@Column(name = "trans_date")
	private Date transactionDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerTransId() {
		return customerTransId;
	}

	public void setCustomerTransId(int customerTransId) {
		this.customerTransId = customerTransId;
	}

	public int getAccountTransId() {
		return accountTransId;
	}

	public void setAccountTransId(int accountTransId) {
		this.accountTransId = accountTransId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(float startBalance) {
		this.startBalance = startBalance;
	}

	public float getEndBalance() {
		return endBalance;
	}

	public void setEndBalance(float endBalance) {
		this.endBalance = endBalance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

}
