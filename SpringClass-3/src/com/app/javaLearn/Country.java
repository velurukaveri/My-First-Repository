package com.app.javaLearn;

public class Country {
	
	private String cname;
	private String state;
	private String city;
	private String street;
	public Country(String cname, String state, String city, String street) {
		super();
		this.cname = cname;
		this.state = state;
		this.city = city;
		this.street = street;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Country [cname=" + cname + ", state=" + state + ", city=" + city + ", street=" + street + "]";
	}
	
}
