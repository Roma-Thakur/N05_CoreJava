package com.tnsif.dayfifteen;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.add(40);
		st.add(70);
		st.add(20);
		st.add(50);
		st.add(80);
		st.add(10);
		System.out.println(st);
		System.out.println("Size: "+st.size());
		System.out.println("Is Queue Empty: "+st.isEmpty());
		System.out.println("Element to be remove is: "+st.peek());
		
		System.out.println(st);
		
		while(!st.isEmpty())
		{
			System.out.println(st.pop()+" removed");
		}
		System.out.println(st);

	}

}
