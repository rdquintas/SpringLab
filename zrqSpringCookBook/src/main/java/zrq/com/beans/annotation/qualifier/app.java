package zrq.com.beans.annotation.qualifier;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/beans/annotation/qualifier/Beans.xml");
	      Profile profile = (Profile) context.getBean("profile");

	      profile.printAge();
	      profile.printName();
	}
}
