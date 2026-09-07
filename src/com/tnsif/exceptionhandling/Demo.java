package com.tnsif.exceptionhandling;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numOne=sc.nextInt();
		int numTwo=sc.nextInt();
		try {
		int c=numOne/numTwo;
		
		}
		catch(ArithmeticException e) {
			System.out.println("Hi");
			e.printStackTrace();
			e.getMessage();
		}
		System.out.println("Will not work");
		System.out.println("Will not work");

	}
}

