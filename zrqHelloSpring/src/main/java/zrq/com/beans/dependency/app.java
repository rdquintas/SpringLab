package zrq.com.beans.dependency;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/beans/dependency/Beans.xml");

	      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
	      objA.getMessage1();
	      objA.getMessage2();

	      HelloPortugal objB = (HelloPortugal) context.getBean("helloPortugal");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
		
		
		// SpringApplication.run(ZrqHelloSpringApplication.class, args);
	}
}
