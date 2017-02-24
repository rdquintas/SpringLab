package zrq.com.beans.annotation.configuration1;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}