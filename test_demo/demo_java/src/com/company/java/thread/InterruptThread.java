package com.company.java.thread;

class Runnable1 implements Runnable {

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Runnable1 is interrupted");
				Thread.currentThread().interrupt();
				
			}
		}
		System.out.println("Runnable1 done");

	}

}

public class InterruptThread {

	public static void main(String[] args) {
		Runnable1 r1 = new Runnable1();
		Thread t1 = new Thread(r1);
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt();

	}

}
