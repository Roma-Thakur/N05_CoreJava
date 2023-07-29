/*Pratik is so much interesting in gardening and hence he plants more trees in his garden.
 *he plants trees in a rectangular fashion with the order of rows and columns and
 *numbers the trees in a row-wise order. he planted the mango tree only in the first row, first column and last column,
 * given the tree number and rows and columns. your task is to find out whether the given tree is mango tree or not?
 * input n(rows and columns)=5, t(tree number)=11*/
package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
	
	static void isMangoTree(int n,int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a Mango Tree");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of n and t: ");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);

	}

}
