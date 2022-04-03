package com.company.java.thread;

public class DeadlockDemo {

	public static void main(String[] args) {
		final String resource1 = "abc";
		final String resource2 = "def";
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
				  System.out.println("Thread1 locked resource1");
				  synchronized (resource2) {
					  System.out.println("Thread1 locked resource2");
				  }
				  System.out.println("Thread1 unlocked resource2");
				}
				System.out.println("Thread1 unlocked resource1");
				  
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource2) {
				  System.out.println("Thread2 locked resource2");
				  synchronized (resource1) {
					  System.out.println("Thread2 locked resource1");
				  }
				}
			}
		};
		t1.start();
		t2.start();
	}

}
