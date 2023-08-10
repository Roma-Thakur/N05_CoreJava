package org.tnsif.abstractkeyword;
/*to provide implementation of any abstract method of parent class use child class*/
public class Addition extends Operator{

	@Override
	void operation() {
		System.out.println("Addition");
		
	}

	@Override
	void multiplication() {
		System.out.println("Multiplication");
		
	}

}
