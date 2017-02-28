package zrq.com.jdbc.example3;

import java.sql.Connection;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO {

	public void insert(Customer customer) {

		String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		Connection conn = null;

		getJdbcTemplate().update(sql, new Object[] { customer.getCustId(), customer.getName(), customer.getAge() });
	}

	public Customer findByCustomerId(int custId) {
		return new Customer(1, "aaa", 2);

		// String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		//
		// Connection conn = null;
		//
		// try {
		// conn = dataSource.getConnection();
		// PreparedStatement ps = conn.prepareStatement(sql);
		// ps.setInt(1, custId);
		// Customer customer = null;
		// ResultSet rs = ps.executeQuery();
		// if (rs.next()) {
		// customer = new Customer(rs.getInt("CUST_ID"), rs.getString("NAME"),
		// rs.getInt("Age"));
		// }
		// rs.close();
		// ps.close();
		// return customer;
		// } catch (SQLException e) {
		// throw new RuntimeException(e);
		// } finally {
		// if (conn != null) {
		// try {
		// conn.close();
		// } catch (SQLException e) {
		// }
		// }
		// }
	}
}
