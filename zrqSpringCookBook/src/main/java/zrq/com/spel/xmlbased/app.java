package zrq.com.spel.xmlbased;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/spel/xmlbased/Beans.xml");
		Item cust = (Item) context.getBean("itemBean");

		System.out.println("Teste");
		
	}
}
