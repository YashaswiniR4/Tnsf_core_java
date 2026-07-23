package com.tnsif.day14.polymorphism;

public class MethodOverriding {
	private String userName;
	private String password;
	public MethodOverriding() {
	
		this.userName = "admin";
		this.password = "admin";
	}
	public MethodOverriding(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String login(String username,String possword) {
		if(username=="ABC"&&password=="triger")
			return "login Successfully";
		else
			return "retry";
	}
	
}
