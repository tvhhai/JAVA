package com.company.java.thread;

enum MethodType {
		syncInstantMethod1, 
		syncInstantMethod2,
		nonSyncInstantMethod,	
		staticSyncMethod1,
		staticSyncMethod2
	}
class MyClass {
	
	public synchronized void syncInstantMethod1() {
		System.out.println("syncInstantMethod1 start");
		makeThreadSleep();
		System.out.println("syncInstantMethod1 end");
	}
	public synchronized void syncInstantMethod2() {
		System.out.println("syncInstantMethod2 start");
		makeThreadSleep();
		System.out.println("syncInstantMethod2 end");
		
	}
	
	public void nonSyncInstantMethod() {
		System.out.println("nonsyncInstantMethod start");
		System.out.println("nonsyncInstantMethod end");
		
	}
	
	public static synchronized void StaticSyncMethod1() {
		System.out.println("syncStaticMethod1 start");
		makeStaticThreadSleep();
		System.out.println("syncStaticMethod1 end");
	}
	
	public static synchronized void StaticSyncMethod2() {
		System.out.println("syncStaticMethod2 start");
		makeStaticThreadSleep();
		System.out.println("syncStaticMethod2 end");
	}
	
	private void makeThreadSleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void makeStaticThreadSleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class MyThreadDemo extends Thread {
	private MethodType methodID;
	private MyClass myclass;
	public MyThreadDemo(MethodType methodID, MyClass myclass) {
		super();
		this.methodID = methodID;
		this.myclass = myclass;
	}
	public void run() {
		switch (methodID) {
		case syncInstantMethod1: {
			myclass.syncInstantMethod1();
			break;
		}
		case syncInstantMethod2: {
			myclass.syncInstantMethod2();
			break;
		}
		
		case nonSyncInstantMethod: {
			myclass.nonSyncInstantMethod();
			break;
		}
		case staticSyncMethod1: {
			MyClass.StaticSyncMethod1();
			break;
		}
		case staticSyncMethod2: {
			MyClass.StaticSyncMethod2();
			break;
		}
		}
	}
	
}

public class StaticSynchronized {

	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		//case 1:When one thread accesses synchronize instant 
		//method, at that time, other threads cannot access any 
		//synchronized instant method
//		MyThreadDemo t1 = new MyThreadDemo(MethodType.syncInstantMethod1, c1);
//		MyThreadDemo t2 = new MyThreadDemo(MethodType.syncInstantMethod2, c1);
//		t1.start();
//		t2.start();
		
		//case 2:When one thread accesses synchronize instant 
		//method, at that time, other threads can access any 
		//non synchronized instant method
//		MyThreadDemo t3 = new MyThreadDemo(MethodType.syncInstantMethod1, c1);
//		MyThreadDemo t4 = new MyThreadDemo(MethodType.nonSyncInstantMethod, c1);
//		t3.start();
//		t4.start();
		
		//case 3:When one thread accesses synchronize instant 
		//method, at that time, other threads can access any 
		//synchronized static method
//		MyThreadDemo t5 = new MyThreadDemo(MethodType.syncInstantMethod1, c1);
//		MyThreadDemo t6 = new MyThreadDemo(MethodType.staticSyncMethod1, c1);
//		t5.start();
//		t6.start();
		
		//case 3:When one thread accesses static synchronize  
		//method, at that time, other threads cannot access any 
		//static synchronized method
		MyThreadDemo t5 = new MyThreadDemo(MethodType.staticSyncMethod1, c1);
		MyThreadDemo t6 = new MyThreadDemo(MethodType.staticSyncMethod2, c1);
		t5.start();
		t6.start();

		
	}

}
