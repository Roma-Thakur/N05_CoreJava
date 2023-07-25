//driver class
/*program to demonstrate on class and objects*/
package org.tnsif.classandobjects;

public class SandwichExecutor {

	public static void main(String[] args) {
		//object creation
		Sandwich s=new Sandwich();
		s.breadType="Brown Bread";
		s.noOfSlice=4;
		//method call
		s.display();

	}

}
