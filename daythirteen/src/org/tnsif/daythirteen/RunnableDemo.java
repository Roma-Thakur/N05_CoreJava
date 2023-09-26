package org.tnsif.daythirteen;

public class RunnableDemo {

	public static void main(String[] args) {
		//Runnable t1 = new ThreadImp1(); we can also write like this.
		ThreadImp1 t1 = new ThreadImp1();
		Thread th1 = new Thread(t1,"First");
		
		//second way - anonymous class
		Runnable obj = new Runnable() {

			@Override
			public void run() {
				char ch='a';
				for(int i=1;i<=26;i++,ch++)
					System.out.print(Thread.currentThread().getName()+" : "+ch+"\t");	
			}
		};
		Thread th2 = new Thread(obj,"Second");
		
		//lambda expression
		Runnable object=()->
		{
			for(int i=1;i<=15;i+=2)
				System.out.print(i+"\t");
		};
		
		Thread th3 = new Thread(object,"Thread");
		th1.start();
		th2.start();
		th3.start();
	}
}
