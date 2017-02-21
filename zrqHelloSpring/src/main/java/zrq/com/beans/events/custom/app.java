package zrq.com.beans.events.custom;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"zrq/com/beans/events/custom/Beans.xml");

		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		cvp.publish();
		cvp.publish();
	}
}
