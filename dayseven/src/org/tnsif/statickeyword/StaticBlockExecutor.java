package org.tnsif.statickeyword;

public class StaticBlockExecutor {

	static float salary;
	String companyName;
	
	static {
		/*static block is used to initialize the static variable we can't assign a value for any non-static
		 * variable inside the static block*/
		// companyName="Accenture";
		salary=57576.90f;
	}
	
	//static method
	static void print()
	{
		System.out.println(salary);
	}
	public static void main(String[] args) {

		print();
	}

}
