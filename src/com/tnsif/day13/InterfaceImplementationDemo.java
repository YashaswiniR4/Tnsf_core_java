package com.tnsif.day13;

interface Animal {

	void sound();

}

class Dog implements Animal {

	@Override
	public void sound() {

		System.out.println("Dog is Barking");

	}

}

public class InterfaceImplementationDemo {

	public static void main(String[] args) {

		Dog obj = new Dog();

		obj.sound();

	}

}