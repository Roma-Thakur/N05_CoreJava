package org.tnsif.customeexception;
//program to demonstrate on User-defined exception
public class LoginCredentials extends Exception {
	//private data members
	private String str;

	//getters and setters
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
		
		
	}

	//toString method
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
}
