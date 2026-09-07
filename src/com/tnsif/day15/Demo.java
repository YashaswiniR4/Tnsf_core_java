package com.tnsif.day15;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc= new Scanner(System.in);
		int numOne=sc.nextInt();
		int numTwo=sc.nextInt();
		try {
			int c=numOne/numTwo;	
		}
		catch(Exception e) {
			System.out.println("hi");
			e.printStackTrace();
			e.getMessage();
		}
		System.out.println("will not work");
	}

}
