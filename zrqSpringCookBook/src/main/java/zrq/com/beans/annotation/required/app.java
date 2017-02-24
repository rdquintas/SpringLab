package zrq.com.beans.annotation.required;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"zrq/com/beans/annotation/required/Beans.xml");
		Student student = (Student) context.getBean("student");

		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
	}
}
