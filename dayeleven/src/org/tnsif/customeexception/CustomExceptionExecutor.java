package org.tnsif.customeexception;

import java.util.Scanner;
//program to demonstrate on User-defined exception
//driver class
public class CustomExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an Email ID and Password");
		String email=s.nextLine();
		String password=s.nextLine();
		try { 
			if(email.equals("romat.it_ioe@bkc.met.edu") && password.equals("Pass@123"))
			{
				System.out.println("Creadential matched");
			}
			else
			{
				throw new LoginCredentials("Invalid Creadential");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println(e);
		}
	}

}
