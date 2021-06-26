package Assignment_spring_core;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
private String  city="Bettiah", state="Bihar", country="India", street="Teen Lalten Chowk";
private int zip=84543;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}

}
