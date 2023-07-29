/*ask a user for their birth year encoded as 2 digit(like "62")and for the current year,also encoded as 2 digit(like "99").
 * write a program to find the user's current age in years*/

package org.tnsif.challenges;

import java.util.Scanner;

public class abc {
	
	static int age(int by,int cy)
	{
		if(cy>by)
			return (cy-by);
		else
			return (100-by)+cy;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your birth year: ");
		int by=s.nextInt();
		System.out.println("Enter the current year: ");
		int cy=s.nextInt();
		System.out.println(age(by,cy));

	}

}
