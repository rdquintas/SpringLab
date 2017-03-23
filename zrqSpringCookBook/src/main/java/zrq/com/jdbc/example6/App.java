package zrq.com.jdbc.example6;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/jdbc/example6/Beans.xml");

		ContactJDBCTemplate theJDBCTemplate = (ContactJDBCTemplate) context.getBean("contactJDBCTemplate");
		System.out.println("ZRQ OK");

		// (a) 2 examples with SELECT SINGLE
		System.out.println("(a) ZRQ findFirstNameById: " + theJDBCTemplate.findFirstNameById(3L));
		System.out.println("(a) ZRQ findLastNameById: " + theJDBCTemplate.findLastNameById(3L));

		// (b) Example with SELECT INTO TABLE
		List<Contact> contacts = theJDBCTemplate.findAll();
		for (Contact record : contacts) {
			System.out.print("(b) ID: " + record.getId());
			System.out.print(", First_Name: " + record.getFirst_name());
			System.out.print(", Last_Name: " + record.getLast_name());
			System.out.print(", Birth_Date: " + record.getBirth_date().toGMTString());
			System.out.println("");
		}

		// (c) Example with SELECT INTO TABLE using SPRING class MappingSqlQuery
		System.out.println("(c) -- SPRING class MappingSqlQuery --");
		SelectAllContacts selectAllContacts = new SelectAllContacts(theJDBCTemplate.getDataSource());
		List<Contact> contacts2 = selectAllContacts.execute();
		for (Contact record : contacts2) {
			System.out.print("(c) ID: " + record.getId());
			System.out.print(", First_Name: " + record.getFirst_name());
			System.out.print(", Last_Name: " + record.getLast_name());
			System.out.print(", Birth_Date: " + record.getBirth_date().toGMTString());
			System.out.println("");
		}

		// (d) Example with SELECT JOIN
		List<Contact> contactsWithDetail = theJDBCTemplate.findAllWithDetail();
		for (Contact contact : contactsWithDetail) {
			System.out.println("(d) ZRQ contact: " + contact.toString());
			if (contact.getContactTelDetails() != null) {
				for (ContactTelDetail contactTelDetail : contact.getContactTelDetails()) {
					System.out.println(" > contactTelDetail: " + contactTelDetail.toString());
				}
			}
			System.out.println();
		}

	}
}
