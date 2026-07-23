package com.tnsif.day13;

@FunctionalInterface
interface Demo {
	void display();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		Demo obj = new Demo() {

			@Override
			public void display() {
				System.out.println("Functional Interface Example");
			}
		};

		obj.display();
	}

}