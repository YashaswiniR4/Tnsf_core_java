package com.tnsif.springioc;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using Airtel sim");
	}

	@Override
	public void browsing() {
		System.out.println("Browsing  using Airtel sim");
		
	}

}
