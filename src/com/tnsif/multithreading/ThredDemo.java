package com.tnsif.multithreading;

public class ThredDemo {

	public static void main(String[] args) {
		ChildThread t1=new ChildThread("Thread 1", 5);
		ChildThread t2=new ChildThread("Thread 2", 6);
		
		t1.start();
		t2.start();
		
		try {
		t1.join();
		t2.join();
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		
		System.out.println("I am in main method");

	}

}