package zrq.com.jdbc.example2;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/jdbc/example2/Beans.xml");

		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
		Customer customer = new Customer(1, "Ricardo", 28);
		customerDAO.insert(customer);

		Customer customer1 = customerDAO.findByCustomerId(1);
		System.out.println(customer1);

	}
}
