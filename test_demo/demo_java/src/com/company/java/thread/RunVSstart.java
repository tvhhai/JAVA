package com.company.java.thread;


class RunnableImpl implements Runnable {
    @Override
	public void run() {
		for (int i =0; i< 3; i++) {
		  System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
	}
	
}
public class RunvsStart {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		RunnableImpl r3 = new RunnableImpl();
		Thread t3 = new Thread(r3);
		t3.setName("mythread");
		t3.start(); //create a new thread
		//t3.run(); //not create any new thread
		
		
	}

}
