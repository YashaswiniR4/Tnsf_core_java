package com.tnsif.multithreading.synchronization;

public class AccountThread extends Thread{
	private Account acc;
	private int amt;
	
	public AccountThread(Account acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
		/* Using Synchronized Block - withdraw() is non synchronized
		 * synchronized (acc) 
		 * { 
		 * acc.withdraw(amt); 
		 * }
		 */		
		try {
			acc.deposit(amt);
		} catch (DepositLimitExceedsException e) {
			System.err.println(e);
		}
	}
	
	

}