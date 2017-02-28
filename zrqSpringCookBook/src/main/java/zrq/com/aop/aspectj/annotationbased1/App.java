package zrq.com.aop.aspectj.annotationbased1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("zrq/com/aop/aspectj/annotationbased1/Beans.xml");

		CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.addCustomer();
		customer.addCustomerReturnValue();
		customer.addCustomerAround("Ricardo");
		try {
			customer.addCustomerThrowException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}


	}
}
