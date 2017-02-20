package zrq.com.beans.injection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/beans/injection/Beans.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();

	}
}
