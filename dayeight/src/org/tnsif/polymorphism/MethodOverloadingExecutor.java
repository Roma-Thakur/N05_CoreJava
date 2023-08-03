//program to demonstrate on compile-time polymorphism
package org.tnsif.polymorphism;

import java.util.Scanner;

class BollyWood{
	
	String str1,str2,str3;
	//method overloading based on changing the no. of arguments
	static void display(String str1,String str2)
	{
		System.out.println(str1+" loves "+str2);
	}
	
	static void display(String str1,String str2,String str3)
	{
		System.out.println(str1+" loves "+str2+ " as well as "+str3);
	}
}
//driver class
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a three strings: ");
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		BollyWood.display(str1, str2);
		BollyWood.display(str1,str2,str3);

	}

}
