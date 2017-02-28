package zrq.com.jdbc.example4;

import java.util.List;

public interface CustomerDAO {
	public void insertBatch(final List<Customer> customers);
	public void insertBatchSQL(final String sql);
}