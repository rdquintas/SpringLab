package zrq.com.beans.validator2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("zrq/com/beans/validator2/Beans.xml");

		Contact chris = ctx.getBean("chris", Contact.class);
		System.out.println("Chris info: " + chris);
		Contact myContact = ctx.getBean("myContact", Contact.class);
		System.out.println("My contact info: " + myContact);
	}
}
