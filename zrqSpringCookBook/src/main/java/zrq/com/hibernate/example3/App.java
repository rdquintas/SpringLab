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

		// Example with SELECT SINGLE
		Contact contact = contactDao.findById(1l);
		System.out.println("*****************");
		System.out.println("**** Contact with id 1:" + contact);
		System.out.println("*****************");

		// Example with INSERT SINGLE
		// I have do delete entry from MySQL after 1st run - otherwise I get
		// duplicate key and corresponding Exception
		Contact ins = new Contact();
		ins.setFirstName("Ricardo");
		ins.setLastName("Quintas");
		ins.setBirthDate(new Date());
		ContactTelDetail insDetail = new ContactTelDetail("Home", "1111111111");
		ins.addContactTelDetail(insDetail);
		insDetail = new ContactTelDetail("Mobile", "2222222222");
		ins.addContactTelDetail(insDetail);
		contactDao.save(ins);

		// Example with SELECT *
		listContacts(contactDao.findAll());

		// Example with SELECT JOIN *
		listContactsDetails(contactDao.findAllWithDetail());

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

	private static void listContactsDetails(List<Contact> contacts) {
		System.out.println("");
		System.out.println("Listing contacts WITH details:");
		for (Contact contact : contacts) {
			System.out.println(contact);
			System.out.println(contact.getContactTelDetails().toString());
			System.out.println();
		}
	}
}
