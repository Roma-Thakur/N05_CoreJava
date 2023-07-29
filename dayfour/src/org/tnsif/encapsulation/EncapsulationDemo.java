//Program to demonstrate on encapsulation
//encapsulation achieves the data hiding using private access specifier
//driver class
package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		//setting a value for private members
		h.setAccountNo(234567890123L);
		h.setAccountType("Current Account");
		h.setCvvNo(233);
		h.setPinNo(1221);
		//accessing and printing all the private members
		/*System.out.println(h.getAccountNo());
		System.out.println(h.getAccountType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());*/
		System.out.println(h);

	}

}
