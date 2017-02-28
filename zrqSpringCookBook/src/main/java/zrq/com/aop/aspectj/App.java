package zrq.com.aop.aspectj;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/aop/aspectj/Beans.xml");

		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.addCustomer();

	}
}
