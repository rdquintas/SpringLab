package zrq.com.jdbc.example3;

import java.util.List;

public interface CustomerDAO {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
	public Customer findByCustomerId2(int custId);
	public List<Customer> findAll();
	public int findTotalCustomer();
}