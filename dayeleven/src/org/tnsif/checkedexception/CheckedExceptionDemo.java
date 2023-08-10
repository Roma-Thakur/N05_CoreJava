//program to demonstrate on Checked Exception
package org.tnsif.checkedexception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Admin\\Desktop\\BEIT\\TNSIF\\Core Java\\TNSIF.txt");
			System.out.println("File has found");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not exist: "+e);
		}
	}

}
