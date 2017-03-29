package zrq.com.hibernate.example4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zrq.com.hibernate.example3.ContactDao;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("zrq/com/hibernate/example4/Beans.xml");
//		ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);
 
		System.out.println("ZRQ OK");
	}



}
