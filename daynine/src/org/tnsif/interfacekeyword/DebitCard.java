package org.tnsif.interfacekeyword;

public interface DebitCard {

	/*By default all the variable inside an interface is public
	 * static final and if it final then we must have to initialize 
	 * vale for the variable*/
		long cardno=5789696860797l;
		
		/*We can't use concrete method inside an interface 
		 * by default method inside an interface is an abstract */
		void displayCardDetails();
		/*default method and static method is the new features of Java
		 * which can we use, inside an interface*/
		default void display() 
		{
			System.out.println("Default Method");
		}
		//static method
		static void print()
		{
			System.out.println("Static Method");
		}
}
