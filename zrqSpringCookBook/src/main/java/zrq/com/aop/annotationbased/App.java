package zrq.com.aop.annotationbased;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/aop/annotationbased/Beans.xml");

		Student student = (Student) context.getBean("student");

		student.getName();
//		student.getAge();

//		student.printThrowException();
	}
}
