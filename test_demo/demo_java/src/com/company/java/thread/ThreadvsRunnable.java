package com.company.java.thread;

class MyThread extends Thread {
	private int count = 0;
	public void run() {
		count++;
		System.out.println(count+ "Hello MyThread");
	}
}

class RunnableThread implements Runnable {
    private int count = 0;
	@Override
	public void run() {
		count++;
		System.out.println(count+ "Hello RunnableThread");
		
	}
	
}
public class ThreadvsRunnable {

	public static void main(String[] args) {
		//way 1
		/*MyThread t1 = new MyThread();
		t1.start();
		
		MyThread t11 = new MyThread();
		t11.start();
*/
		//way 2
/*		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Hello world");
			}
		};
		t2.start();
		*/
		//way3
		RunnableThread r3 = new RunnableThread();
		Thread t3 = new Thread(r3);
		t3.start();
		
		Thread t4 = new Thread(r3);
		t4.start();
	}

}
