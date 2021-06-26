package Assignment_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String args[]) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaTest.class);
		Customer customer=(Customer)context.getBean("getCustomer");
		System.out.println(customer);
		
	}

}