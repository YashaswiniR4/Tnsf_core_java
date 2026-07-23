package com.tnsif.day14.polymorphism;

public class MethodOverLoadingDemo {
	private int a,b;
	 
    
	 
	public MethodOverLoadingDemo() {
		this.a=10;
		this.b=20;
	}


	public MethodOverLoadingDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}


	public MethodOverLoadingDemo(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}
	int addition(int a,int b){
		int sum=a+b;
		return sum;
	}
	float addition(float a,float b){
		float sum=a+b;
		return sum;
	}
	float addition(){
		int sum=this.a+this.b;
		return sum;
	}

}
