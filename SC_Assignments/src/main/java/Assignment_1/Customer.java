package Assignment_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 @Component
public class Customer {
	
 @Value("12342")
	private String customerId;
 @Value("Joybrata")
	private String customerName;
 @Value("7986453445")
private String customerContact;
	@Autowired
	private Address customerAddress;
	public Customer(String customerId, String customerName, String customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
	}
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
	
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	
	
	
	
	
}