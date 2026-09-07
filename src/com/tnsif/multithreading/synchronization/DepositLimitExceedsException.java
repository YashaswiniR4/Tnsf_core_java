package com.tnsif.multithreading.synchronization;

public class DepositLimitExceedsException extends Exception {
String msg;

public DepositLimitExceedsException(String msg) {
	super();
	this.msg = msg;
}

}