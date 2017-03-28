package zrq.com.hibernate.example3;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.*;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("zrq/com/hibernate/example3/Beans.xml");
		ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);
		listContacts(contactDao.findAll());
		System.out.println("ZRQ OK");
	}

	private static void listContacts(List<Contact> contacts) {
		System.out.println("");
		System.out.println("Listing contacts without details:");
		for (Contact contact : contacts) {
			System.out.println(contact);
			System.out.println();
		}
	}
}
