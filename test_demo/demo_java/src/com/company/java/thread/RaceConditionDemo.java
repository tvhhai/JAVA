package com.company.java.thread;

class Resource {
	public static int count =0;
	public void doSomething() {
		for (int i=0; i < 100000; i++) {
			count++;
		}
	}
	public void doLogging() {
		System.out.println(Thread.currentThread().getName() + "doLogging");
	}
	public int getCount() {
		
		return count;
	}
}

class RaceRunnable implements Runnable {
	private Resource resource;
	public RaceRunnable(Resource resource) {
		super();
		this.resource = resource;
	}
	@Override
	public void run() {
		synchronized (resource) {
		    resource.doSomething();
		}
		resource.doLogging();
		
	}
	
	
}
public class RaceConditionDemo {

	public static void main(String[] args) throws InterruptedException {
		Resource res = new Resource();
		RaceRunnable r = new RaceRunnable(res);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println(res.getCount());
	}

}
