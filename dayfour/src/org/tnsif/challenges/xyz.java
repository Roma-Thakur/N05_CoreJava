/*There are N people standing in a circle waiting to be executed. 
 * The counting out begins at some point in the circle and 
 * proceeds around a circle in a fixed direction. In each step a certain no. of people
 * are skipped and the next person is executed. The illumination proceeds around the circle 
 * (which is becoming smaller and smaller as the executed people are removed),
 * until only the last person remains,who is given freedom.
 * Given the total no. of person and I'm a no. K which indicates that K-1 person are skipped
 * and kth person is killed in the circle. The task is to choose the person in the initial circle that survives*/
//n=10 k=2 using recursion
package org.tnsif.challenges;

import java.util.Scanner;

public class xyz {
	
	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return (survive(n-1,k)+k-1)%n+1;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
	}

}
