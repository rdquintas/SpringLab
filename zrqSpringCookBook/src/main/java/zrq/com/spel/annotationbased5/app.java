package zrq.com.spel.annotationbased5;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/spel/annotationbased5/Beans.xml");
		Customer cust = (Customer) context.getBean("customerBean");

		System.out.println(cust);
		
	}
}
