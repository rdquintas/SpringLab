package zrq.com.jdbc.example3;

public interface CustomerDAO {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}