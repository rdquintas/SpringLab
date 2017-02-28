package zrq.com.jdbc.example3;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/jdbc/example3/Beans.xml");

		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");

		// Customer customer = new Customer(2, "Ricardo Quintas 2", 47);
		// customerDAO.insert(customer);

		Customer cust1 = customerDAO.findByCustomerId(1);
		System.out.println("Customer findByCustomerId: " + cust1);

		cust1 = customerDAO.findByCustomerId2(2);
		System.out.println("Customer findByCustomerId2: " + cust1);

		List<Customer> customers = customerDAO.findAll();
		for (Customer cust : customers) {
			System.out.println("List Customer : " + cust);
		}

		int total = customerDAO.findTotalCustomer();
		System.out.println("Total : " + total);

	}
}
