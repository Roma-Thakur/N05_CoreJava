package org.tnsif.daythirteen;

public class ThreadDemo {
	static void printHello()
	{
		System.out.println("printHello : "+Thread.currentThread());
		for(int i=1;i<=10;i++)
			System.out.println("Hello");
	}

	static void printOdd()
	{
		for(int i=1;i<=10;i++)
			System.out.println(i);
		System.out.println("printOdd : "+Thread.currentThread());
	}
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t);
		printHello();
		System.out.println(Thread.currentThread());
		printOdd();

	}

}
