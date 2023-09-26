package org.tnsif.threadsynchronization;

@SuppressWarnings("serial")
public class DepositLimitExceedsException extends Exception {
	public DepositLimitExceedsException() 
	{
		super("Deposit limit exceede...");
	}

	public DepositLimitExceedsException(String message) {
		super(message);
	}
}
