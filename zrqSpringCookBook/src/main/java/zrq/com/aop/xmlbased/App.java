package zrq.com.aop.xmlbased;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/aop/xmlbased/Beans.xml");

		Student student = (Student) context.getBean("student");

		student.getName();
		student.getAge();

		student.printThrowException();
	}
}
