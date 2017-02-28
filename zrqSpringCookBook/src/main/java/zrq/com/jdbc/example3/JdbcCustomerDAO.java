package zrq.com.jdbc.example3;

import java.sql.Connection;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO {

	public void insert(Customer customer) {

		String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		Connection conn = null;

		getJdbcTemplate().update(sql, new Object[] { customer.getCustId(), customer.getName(), customer.getAge() });
	}

	// This alternative uses the CustomerRowMapper
	public Customer findByCustomerId(int custId) {
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

		Customer customer = (Customer) getJdbcTemplate().queryForObject(sql, new Object[] { custId },
				new CustomerRowMapper());

		return customer;
	}

	// In Spring 2.5, comes with a handy RowMapper implementation called
	// ‘BeanPropertyRowMapper’, which can maps a row’s column value to a
	// property by matching their names.
	// Just make sure both the property and column has the same name, e.g
	// property ‘custId’ will
	// match to column name ‘CUSTID’ or with underscores ‘CUST_ID’.
	public Customer findByCustomerId2(int custId) {
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

		Customer customer = (Customer) getJdbcTemplate().queryForObject(sql, new Object[] { custId },
				new BeanPropertyRowMapper(Customer.class));

		return customer;
	}

	
	public List<Customer> findAll() {
		String sql = "SELECT * FROM CUSTOMER";

		List<Customer> customers  = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper(Customer.class));

		return customers;
	}
	
	public int findTotalCustomer(){
		String sql = "SELECT COUNT(*) FROM CUSTOMER";
		int total = getJdbcTemplate().queryForInt(sql);
		return total;
	}
}
