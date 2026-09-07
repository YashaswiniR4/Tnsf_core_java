package com.tnsif.multithreading.synchronization;

public class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException() {
	 System.out.println("Insufficient balance");
 }
}