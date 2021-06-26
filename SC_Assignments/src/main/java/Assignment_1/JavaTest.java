package Assignment_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="SC_Assignments.Assignment_1")
public class JavaTest {
	
	@Bean 
	public Address getAddress() {
		Address address=new Address("Soudamini Nagar","Rishra","India","712250");
		return address;
	}
	
	@Bean
	public Customer getCustomer() {
		Customer cus=new Customer("100","Joybrata","8276962147");
		return cus;
	}
}
