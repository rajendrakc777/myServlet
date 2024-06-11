package com.service;
//POGO class -->
//In encapsulation, a POJO (Plain Old Java Object) class serves as a simple Java class 
//that encapsulates fields (attributes) and provides access to them through methods 
//(getter and setter methods) without exposing its internal implementation.
public class UseDemo {
	String username;
	String password;
	String fullname;
	String email;
	String address;
	public UseDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UseDemo(String username, String password, String fullname, String email, String address) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UseDemo [username=" + username + ", password=" + password + ", fullname=" + fullname + ", email="
				+ email + ", address=" + address + "]";
	}
	
	
	
	

}
