package Assignment_1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 @Component
public class Address {
	@Value("Mirganj")
	private String city;
	@Value("Bihar")
	private String state;
	@Value("India")
	private String country;
	@Value("123A")
	private String street;
	@Value("345672")
	private String zip;
	public Address(String city, String state, String country, String street, String zip) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.street = street;
		this.zip = zip;
	}
	public Address(String string, String string2, String string3, String string4) {
		
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getStreet() {
		return street;
	}
	public String getZip() {
		return zip;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", street=" + street + ", zip="
				+ zip + "]";
	}
	
	

}
