package com.tnsif.multithreading.synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Account acc=new Account(123456,"Yashu",20000);
		AccountThread t1=new AccountThread(acc,3000);
		AccountThread t2=new AccountThread(acc,20000);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		System.out.println("--------------------------------------------------------");
		System.out.println(acc);

	}

}