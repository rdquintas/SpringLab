package zrq.com.properties.file2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/properties/file2/Beans.xml");
		
		SupaDupaBean theBean = (SupaDupaBean) context.getBean("supaDupa");
		System.out.println(theBean.toString());
	}
}
