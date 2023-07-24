// Program to demonstrate on bunjee jumping using nested if
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("You are Eligible");
				if(weight>110)
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else {
				System.out.println("You are not Eligible");
			}
		}
		else {
			System.out.println("You are not Eligible");
		}
	}

}
