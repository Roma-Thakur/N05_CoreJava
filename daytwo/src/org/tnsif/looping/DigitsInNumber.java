package org.tnsif.looping;

import java.util.Scanner;

public class DigitsInNumber {

	public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter a Number: ");
	      int n = s.nextInt();
	      
	      int digits=0;
	      
	      while(n!=0)
	      {
	         digits++;
	         n = n/10;
	      }
	      
	      System.out.println("\nThe Total Number of Digits are = " +digits);

	}

}
