package zrq.com.hibernate.example1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("zrq/com/hibernate/example1/hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		Task task = new Task();
		task.setId(new Long(1));
		task.setName("Hello world task");
		task.setDescription("Hello world task description");
		session.save(task);
		tx.commit();
		session.close();
	}
}
