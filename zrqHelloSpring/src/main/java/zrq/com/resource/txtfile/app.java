package zrq.com.resource.txtfile;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/resource/txtfile/Beans.xml");

		CustomResourceLoader customResourceLoader = (CustomResourceLoader) context.getBean("customResourceLoader");

		try {
			customResourceLoader.showResourceData();
		} catch (IOException e) {			
			System.out.print(e.getMessage());
		}
	}
}
