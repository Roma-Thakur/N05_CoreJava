package org.tnsif.statickeyword;
/*static variable: if any variable is non-static and outside the main function and if you want to access that variable
 * inside the main function,then we can make that variable as static*/
public class StaticVariableExecutor {
	//int num=67;
	static int num=67;

	public static void main(String[] args) {
		/*StaticVariableExecutor s=new StaticVariableExecutor();
		System.out.println(s.num);*/
		System.out.println(num);
	}

}
