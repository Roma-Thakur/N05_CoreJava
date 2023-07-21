//program to demonstrate on Logical Operator
package org.tnsif.operators;

public class LogicalOperatorDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println((5==3) && (14>6));
		System.out.println((5==3) || (14>6));
		System.out.println(!((5==3) && (14>6)));
	}

}
