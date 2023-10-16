//program to demonstrate on Access specifier
//Driver Class
package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifier.*;
public class BankExecutor {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.bankName="SBI";
		b.displayPublic();
		/*pinNo and displayPrivate() method are private,
		 * so we can't access into another class and
		 * another package, only we can access private
		 * data members inside the same class*/
		
		//b.pinNo;
		//b.displayPrivate();
		
		/*accountNo and displayDefault() method are default that's why,
		 * we are not able to access into another package,
		 * only we can access private within the same package*/
		
		//b.accountNo;
		//b.displayDefault();
	}

}
