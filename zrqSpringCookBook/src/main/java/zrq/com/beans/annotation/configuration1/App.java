package zrq.com.beans.annotation.configuration1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}