package zrq.com.beans.config.javabased;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");

		obj.printHelloWorld("Spring3 Java Config");
	}
}
