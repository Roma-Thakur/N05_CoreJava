package org.tnsif.interfacekeyword;
//driver class
//Program to demonstrate on an interface
public class InterfaceExecutor {

	public static void main(String[] args) {
		
		/*We cannot instantiate an interface*/
		//DebitCard d=new DebitCard();
		SBIDebitCard s=new SBIDebitCard();
		s.displayCardDetails();
		/*We can call default method of an interface using the obj.
		 * of implementable class*/
		/*Print is a static method inside an interface to call print method 
		 * We have to use interfacename.methodname();*/
		DebitCard.print();
		s.display();
		CheesePopCorn c=new CheesePopCorn();
		c.displayReceipe();
		Person p=new Person();
		p.showDrinkName();
	}

}
