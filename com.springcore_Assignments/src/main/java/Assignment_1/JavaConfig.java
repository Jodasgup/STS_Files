package Assignment_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore_Assignments/Assignment_1")
public class JavaConfig {
	
	@Bean 
	public Address getAddress() {
		Address address=new Address();
		return address;
	}
	
	@Bean
	public Customer getCustomer() {
		Customer cus=new Customer();
		return cus;
	}
}
