package zrq.com.beans.config.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "helloBean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}

}