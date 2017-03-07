package zrq.com.beans.validator;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/beans/validator/Beans.xml");

		Person per = (Person) context.getBean("person");
		PersonValidator perVal = (PersonValidator) context.getBean("personValidator");

		Errors err = new BeanPropertyBindingResult(per, "objectName");

		perVal.validate(per, err);

		List<ObjectError> allObjectErrors = err.getAllErrors();
		for (ObjectError objectError : allObjectErrors) {
			if (objectError instanceof FieldError) {
				FieldError fieldError = (FieldError) objectError;
				System.out.println("Field name is " + fieldError.getField());
			}
			System.out.println("Codes " + Arrays.asList(objectError.getCodes()).toString());
			System.out.println("Error Code is " + objectError.getCode());
			System.out.println("Default message is " + objectError.getDefaultMessage());
			System.out.println();
		}		
	}
}
