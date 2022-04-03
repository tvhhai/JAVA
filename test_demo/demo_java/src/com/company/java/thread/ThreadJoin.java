package com.company.java.thread;

class RunnalbeThread1 implements Runnable {
    public int getCount() {
		return count;
	}
	private int count = 0;
	@Override
	public void run() {
		count++;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count+ "Hello RunnableThread");
		
	}
	
}
public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		RunnalbeThread1 r = new RunnalbeThread1();
		Thread t1 = new Thread(r);
		t1.start();
		Thread t2 = new Thread(r);
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Main thread finished" + r.getCount());

	}

}
