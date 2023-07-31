package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	
	int x;
	//default constructor
	ThisKeywordDemoFour()
	{
		//invoking current constructor or calling parameterized constructor
		this(34);
		System.out.println("Default Constructor");
	}
	
	ThisKeywordDemoFour(int x)
	{
		this.x=x;
		System.out.println("Parameterized Constructor: "+x);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ThisKeywordDemoFour f= new ThisKeywordDemoFour();
	}
}
