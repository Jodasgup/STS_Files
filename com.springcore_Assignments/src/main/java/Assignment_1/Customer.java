package Assignment_1;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Value("100")
	private String customerId;
	
	@Value("Ashique")
	private String customerName;
	
	@Value("7088985506")
	private String customerContact;
	
	@Autowired
	private Address customerAddress;
	
	public String getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	
	
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void printDetail() {
		
		System.out.println("Customer Id = "+getCustomerId()+", Customer Name = "+getCustomerName()+", Customer Contact = "+getCustomerContact()+", Customer Address = "+
	getCustomerAddress().getStreet()+" "+getCustomerAddress().getCity()+" "+getCustomerAddress().getState()+" "+getCustomerAddress().getZip()+" "+getCustomerAddress().getCountry());
	}
	
}