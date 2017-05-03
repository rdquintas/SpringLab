package zrq.com.hibernate.example4;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("zrq/com/hibernate/example4/Beans.xml");
		// ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);
		ContactService contactService = ctx.getBean("jpaContactService", ContactService.class);
		ContactSummaryService contactServicePOJO = ctx.getBean("contactSummaryService", ContactSummaryService.class);
		
		// Example with SELECT *
		listContacts(contactService.findAll());

		// Example with SELECT * (using JOIN)
		listContactsWithDetail(contactService.findAllWithDetail());

		// Example with SELECT SINGLE*
		singleContact(contactService.findById(1L));
		
		// Example with SELECT * (using POJO) 
		// Este exemplo é interessante, uma vez que utilizo um POJO 
		// para tratar de cada item seleccionado
		listContactsWithPOJO(contactServicePOJO.findAll());

	}

	private static void listContactsWithPOJO(List<ContactSummary> contactsSummary) {
		System.out.println("");
		System.out.println("Listing contacts using POJO:");
		for (ContactSummary contactSummary : contactsSummary) {
			System.out.println(contactSummary);
			System.out.println();
		}
	}
	
	private static void singleContact(Contact contact) {
		System.out.println("");
		System.out.println("Single Contact:");
		System.out.println(contact);
	}

	private static void listContacts(List<Contact> contacts) {
		System.out.println("");
		System.out.println("Listing contacts without details:");
		for (Contact contact : contacts) {
			System.out.println(contact);
			System.out.println();
		}
	}

	private static void listContactsWithDetail(List<Contact> contacts) {
		System.out.println("");
		System.out.println("Listing contacts with details:");
		for (Contact contact : contacts) {
			System.out.println(contact);
			if (contact.getContactTelDetails() != null) {
				for (ContactTelDetail contactTelDetail : contact.getContactTelDetails()) {
					System.out.println(contactTelDetail);
				}
			}
			if (contact.getHobbies() != null) {
				for (Hobby hobby : contact.getHobbies()) {
					System.out.println(hobby);
				}
			}
			System.out.println();
		}
	}

}
