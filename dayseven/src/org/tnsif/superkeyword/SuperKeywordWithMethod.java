package org.tnsif.superkeyword;
//parent class
class Sports
{
	String sportsName="Cricket";
	void display()
	{
		System.out.println("Sports Name is: "+sportsName);
	}
}
//child class
class Cricket extends Sports
{
	int noOfPlayers=11;
	void display()
	{
		/*If parent and child class methods are same and if we want to call parent class method 
		 * inside the child class then use super.methodname();*/
		super.display();
		System.out.println("No. of Players is: "+noOfPlayers);
	}
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		c.display();
	}

}
