package com.hygj.test;

public class Test {

	public static void main(String[] args) {
		
		Runnable myRunnable = new MyRunnable();
		
		MyThread myThread = new MyThread(myRunnable);
		myThread.start();
	}
	
	
}

class MyRunnable implements Runnable{
	public void run() {
		System.out.println("runnable");
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThread extends Thread{
	
	public MyThread(Runnable runnable){
		super(runnable);
	}
	
	public void run() {
		System.out.println("thread");
		System.out.println(Thread.currentThread().getName());
	}
}
