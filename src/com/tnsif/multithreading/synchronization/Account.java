package com.tnsif.multithreading.synchronization;

public class Account implements Bank {
	private int accNo;
	private String name;
	private double balance;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account() {
	}

	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public synchronized void deposit(int depAmt) throws DepositLimitExceedsException {
		if (depAmt > 25000)
			throw new DepositLimitExceedsException("Daily limit exceeds...");
		else {
			this.balance += depAmt;
			System.out.println("Amount Deposited...." + depAmt);
		}
		
	}

	@Override
	public synchronized void withdraw(int wdAmt) throws InsufficientBalanceException {
		if (balance - wdAmt < MINBAL)
			throw new InsufficientBalanceException();
		else {
			balance = balance - wdAmt;
			System.out.println("after withdrwing Rs." + wdAmt + " current Balance : Rs." + balance);
		}
		
	}

}