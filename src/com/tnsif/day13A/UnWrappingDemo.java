package com.tnsif.day13A;

public class UnWrappingDemo {

	public static void main(String[] args) {

		Integer wrap = Integer.valueOf(25);

		int value = wrap.intValue();

		System.out.println("Unwrapped Value : " + value);

	}

}