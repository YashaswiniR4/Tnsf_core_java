package com.tnsif.day14.polymorphism;



public class MethodOverridingDemo extends MethodOverriding{
	@Override
	public String login(String username,String password) {
		if(username=="ABC"&&password=="triger")
			return "login Successfully";
		else
			return "retry";
	}

}
