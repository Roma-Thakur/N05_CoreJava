//Program to demonstrate on encapsulation
//encapsulation achieves the data hiding using private access specifier
package org.tnsif.encapsulation;
public class HDFC {

	//private data members
	private long accountNo;
	@Override
	public String toString() {
		return "HDFC [accountNo=" + accountNo + ", cvvNo=" + cvvNo + ", accountType=" + accountType + ", PinNo=" + PinNo
				+ "]";
	}
	private int cvvNo;
	private String accountType;
	private int PinNo;
	
	//getters and setters
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return PinNo;
	}
	public void setPinNo(int pinNo) {
		PinNo = pinNo;
	}
	
	
}
