package org.tnsif.abstractkeyword;

public abstract class Operator {

	//abstract
	abstract void operation();
	/*if abstract class contains more than one method,
	 * then provide the implementation to all the abstract
	 * method of that class inside child class*/
	abstract void multiplication();
	//concrete method 
	void print(int a,int b)
	{
		System.out.println(a+b);
	}
}
