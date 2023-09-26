package org.tnsif.threadsynchronization;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() 
	{
		super("Minimum balance in your account...");
	}
	public InsufficientBalanceException(String Message) {
		super(Message);
	}
}
