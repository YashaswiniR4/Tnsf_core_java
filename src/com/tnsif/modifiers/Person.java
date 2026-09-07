package com.tnsif.modifiers;

public class Person {
	private byte idd;
	private int id;
	public String name;
	String address;
	protected long phNo;
	private static String country = "India";
	
	public Person() {
		this.id=102;
		this.name="Yashu";
	}
	
	
	public Person(int id, String name, String address, long phNo) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phNo = phNo;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id =idd;
	}
	public void methodOne() {
		int x = 10;
		System.out.println("Person details " + id + name + address + phNo + x + country);
	}
}