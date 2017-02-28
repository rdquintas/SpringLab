package zrq.com.jdbc.example4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/jdbc/example4/Beans.xml");

		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");

		Customer customer1 = new Customer(20, "Ricardo1", 0);
		Customer customer3 = new Customer(21, "Ricardo2", 1);
		Customer customer2 = new Customer(22, "Ricardo3", 2);

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);

		// insert using BATCH
		customerDAO.insertBatch(customers);

		// alternatively, you can execute the SQL directly.
		String sql = "UPDATE CUSTOMER SET NAME ='BATCHUPDATE'";
		customerDAO.insertBatchSQL(sql);
	}
}
