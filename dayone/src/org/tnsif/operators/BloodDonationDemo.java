package org.tnsif.operators;

import java.util.Scanner;

public class BloodDonationDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your Age");
		int age = s.nextInt();
		
		System.out.println("Enter your Weight");
		int weight = s.nextInt();
		
		if(age>=18 && weight>=50)
		{
			System.out.println("Yes,You are Eligible for Blood Donation");
		}
		else 
		{
			System.out.println("Sorry,You are not Eligible for Blood Donation");
		}

	}

}
