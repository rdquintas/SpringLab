package zrq.com.hibernate.example4;

import java.util.Date;
import java.util.List;
import java.util.Set;

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

		// Example with INSERT
		Contact contact = new Contact();
		contact.setFirstName("Michael");
		contact.setLastName("Jackson");
		contact.setBirthDate(new Date());

		ContactTelDetail contactTelDetail = new ContactTelDetail("Home", "1111111111");
		contact.addContactTelDetail(contactTelDetail);
		contactTelDetail = new ContactTelDetail("Mobile", "2222222222");
		contact.addContactTelDetail(contactTelDetail);

		try {
			contactService.save(contact);
		} catch (Exception e) {
			System.out.println("That one is already there, try another.");
		}

		// Example with UPDATE
		Contact contactUPD = contactService.findById(1l);
		contactUPD.setFirstName("Justin");
		Set<ContactTelDetail> contactTelsUPD = contactUPD.getContactTelDetails();
		ContactTelDetail toDeleteContactTelUPD = null;
		for (ContactTelDetail contactTel : contactTelsUPD) {
			if (contactTel.getTelType().equals("Home")) {
				toDeleteContactTelUPD = contactTel;
			}
		}
		contactTelsUPD.remove(toDeleteContactTelUPD);
		contactService.save(contactUPD);

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

		// Example with DELETE
		Contact contactDEL = contactService.findById(1l);
		contactService.delete(contactDEL);
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
