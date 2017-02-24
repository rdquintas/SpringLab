package zrq.com.properties.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//...

@Configuration
@ComponentScan(basePackages = { "zrq.com.properties.file.*" })
@PropertySource("classpath:zrq/com/properties/file/config.properties")
public class AppConfigMongoDB {

	// 1.2.3.4
	@Value("${mongodb.url}")
	private String mongodbUrl;

	// hello
	@Value("${mongodb.db}")
	private String defaultDb;

	@Bean
	public String mongoTemplate() {
//		MongoClientOptions mongoOptions = new MongoClientOptions.Builder().maxWaitTime(1000 * 60 * 5).build();
//		MongoClient mongo = new MongoClient(mongodbUrl, mongoOptions);
//		MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongo, defaultDb);
//		return new MongoTemplate(mongoDbFactory);
		return this.mongodbUrl;
	}

	// To resolve ${} in @Value
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}