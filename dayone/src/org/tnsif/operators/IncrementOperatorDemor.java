//Program to demonstrate on Pre and Post Increment Operators
package org.tnsif.operators;

public class IncrementOperatorDemor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int p=11,q=2;
		int x=p++;
		int y=p+q;
		++q;
		System.out.println(p);
		System.out.println(q);

	}

}
