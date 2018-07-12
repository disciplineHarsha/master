package com.jdbc.cc;


public class Contact {

	private Integer id;
	private String orgName;
	private String street;
	private String city;
	private	String state;
	Contact(String orgName,String street,String city,String state){
		this.orgName = orgName;
		this.street = street;
		this.city = city;
		this.state =state;
	}	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
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
	
	
	
	
	
}
