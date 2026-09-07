package com.tnsif.lamdaex;

public class Main {
	public static void main(String []args) {
		
		Message  m1=(name)->{
			System.out.println("hello to "+name);
		};
		
		m1.greet("yashu");
	}

}
