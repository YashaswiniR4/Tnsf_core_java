package com.tnsif.day13;

interface A {

	void show();

}

interface B {

	void display();

}

class Test implements A, B {

	@Override
	public void show() {

		System.out.println("Show Method");

	}

	@Override
	public void display() {

		System.out.println("Display Method");

	}

}

public class MultipleInterfaceDemo {

	public static void main(String[] args) {

		Test obj = new Test();

		obj.show();
		obj.display();

	}

}