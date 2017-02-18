package zrq.com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ZrqHelloSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		// SpringApplication.run(ZrqHelloSpringApplication.class, args);
	}
}
