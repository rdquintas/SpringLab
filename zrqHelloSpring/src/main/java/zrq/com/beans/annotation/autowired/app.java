package zrq.com.beans.annotation.autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class app {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/beans/annotation/autowired/Beans.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");

		te.spellCheck();
	}
}
