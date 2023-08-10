package org.tnsif.interfacekeyword;
//Implements class or child class
//Program to demonstrate on multiple inheritance
public class Person implements ColdDrink,Alcohol {
	@Override
	public void showDrinkName() {
		System.out.println(brand+" "+alcoholname+" "+name);
		
	}

}
