package com.tnsif.day14.polymorphism;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       MethodOverLoadingDemo obj;
//       //calling default constructor
//       obj=new MethodOverLoadingDemo();
//       //calling method with 0 parameter
//       System.out.println(obj.addition());
//       
//       obj=new MethodOverLoadingDemo(100,200);
//       System.out.println(obj.addition());
//       
//       obj=new MethodOverLoadingDemo();
//       System.out.println(obj.addition(23,64));
//       System.out.println(obj.addition(56.5f,89.5f));
       
       //MethodOverriding 
       MethodOverriding  obj1;
       obj1=new MethodOverriding();
       System.out.println(obj1.login(obj1.getUserName(),obj1.getPassword()));
       
       
	}

}
