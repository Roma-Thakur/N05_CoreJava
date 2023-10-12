// Program to demonstrate homogeneous ArrayList
package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> intList =  new ArrayList<Integer>();
		intList.add(10);
		intList.add(22);
		intList.add(19);
		intList.add(3);
		intList.add(85);
		
		System.out.println(intList);
		intList.add(2, 50);
		System.out.println(intList);
		
		System.out.println("is 10 present? "+intList.contains(10));
		System.out.println("is 85 present? "+intList.contains(5));
		
		System.out.println("Remove element at 5 : "+intList.remove(5));
		System.out.println(intList);
		
//		System.out.println("Remove element at 20 "+intList.remove(20));
//		System.out.println(intList);
		
		System.out.println("Remove element 19 : "+intList.remove(intList.indexOf(19)));
		System.out.println(intList);
		
		System.out.println(intList.indexOf(21)>=0 ? "21 is not present" : " ");
		System.out.println(intList); 
		
		System.out.println("-------------------------------------------------");
		Iterator<Integer> it = intList.iterator();
		while(it.hasNext()) 
		{
			int no=it.next();
			System.out.println(no+ " : "+no*no);
		}
		
		Collections.sort(intList);
		System.out.println("------------------After Sorting--------------------");
		System.out.println(intList);
		
		Collections.reverse(intList);
		System.out.println("------------------After Reversing--------------------");
		System.out.println(intList);
		
		intList.clear();
		System.out.println(intList);
	}

}
