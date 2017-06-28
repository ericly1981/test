package com.hygj.test;

public class Test2 {
	
	public int a,b,c,d;

	public static void main(String[] args) {
		
		try {
			new Test2().test();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
	}
	
	public void test() throws InterruptedException{
		
		Thread at = new Threada();
		Thread bt = new Threadb();
		Thread ct = new Threadc();
		Thread dt = new Threadd();
		
		at.start();
		at.join();
		bt.start();
		bt.join();
		ct.start();
		ct.join();
		dt.start();
		dt.join();
		
		System.out.println(a + b + c + d);
	}
	
	class Threada extends Thread {
		
		public void run() {
			for(int i = 0 ; i < 10 ; i++){
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				a += i;
			}
		}
	};
	
	class Threadb extends Thread {
		
		public void run() {
			for(int i = 0 ; i < 10 ; i++){
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				b += i;
			}
		}
	};
	
	class Threadc extends Thread {
		
		public void run() {
			for(int i = 0 ; i < 10 ; i++){
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				c += i;
			}
		}
	};
	
	class Threadd extends Thread {
		
		public void run() {
			for(int i = 0 ; i < 10 ; i++){
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				d += i;
			}
		}
	};
}
