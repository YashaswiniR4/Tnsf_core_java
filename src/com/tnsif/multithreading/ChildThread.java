package com.tnsif.multithreading;

public class ChildThread extends Thread {
    String msg;
    int n;
   
	public ChildThread(String msg, int n) {
		super();
		this.msg = msg;
		this.n = n;
	}
	@Override
	public void run() {
		for(int i=0;i<n;i++) {
			try {
			Thread.sleep(3000);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i + msg);
		}
	}

}