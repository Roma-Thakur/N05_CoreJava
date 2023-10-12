package com.tnsif.daysixteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> courses = new HashSet<String>();
		System.out.println(courses.add("Engineering"));
		courses.add("MCA Engineering");
		courses.add("Pharmacy");
		courses.add("MBA");
		System.out.println(courses.add("Engineering"));
		System.out.println(courses);
		
		System.out.println(courses.size());
		Iterator<String> it = courses.iterator();
		while(it.hasNext())
			System.out.println(it.next());

		System.out.println(courses.remove("MBA")?"Course removed":"Course not found");
		System.out.println(courses);
		
		System.out.println("---------------------------------------------------------------");
		HashSet<Integer> hsOne = new HashSet<Integer>();
		hsOne.add(20);
		hsOne.add(10);
		hsOne.add(70);
		hsOne.add(200);
		hsOne.add(90);
		
		HashSet<Integer> hsTwo = new HashSet<Integer>();
		hsTwo.add(20);
		hsTwo.add(10);
		hsTwo.add(70);
		hsTwo.add(200);
		hsTwo.add(90);
		
		System.out.println("First Set : "+hsOne);
		System.out.println("Second Set : "+hsTwo);
		hsOne.retainAll(hsTwo);
		System.out.println("Intersection of Two Sets");
		System.out.println("Resultant Set : "+hsOne);
		
		//Collections.sort(hsTwo);
		
		ArrayList<Integer> list = new ArrayList<Integer>(hsTwo);
		Collections.sort(list);
		System.out.println(list);
		hsTwo = new HashSet<Integer>(list);
		System.out.println("Second Set : "+hsTwo);	
	}
}
