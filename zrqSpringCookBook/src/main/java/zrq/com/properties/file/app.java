package zrq.com.properties.file;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigMongoDB.class);

		String zrq = (String) context.getBean("mongoTemplate");
		System.out.println(zrq);
	}
}
