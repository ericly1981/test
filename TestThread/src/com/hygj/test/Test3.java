package com.hygj.test;

public class Test3 {
	
	public int a,b,c,d;

	public static void main(String[] args) {
		
		try {
			new Test3().test();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void test() throws InterruptedException{
		
//		Thread back = new BackThread();
//		back.setDaemon(true);
//		back.start();
		
		Thread at = new Threada();
		Thread bt = new Threadb();
		Thread ct = new Threadc();
		Thread dt = new Threadd();
		
		at.start();
		bt.start();
//		ct.start();
//		dt.start();
//		
//		System.out.println(a + b + c + d);
	}
	
	class BackThread extends Thread{
		public void run() {
			System.out.println("back run");
			
			
			
		}
		public void interrupt() {
			// TODO Auto-generated method stub
			super.interrupt();
			System.out.println("end");
		}
	}
	
	class Threada extends Thread {
		
		public synchronized void run() {
			for(int i = 0 ; i < 10 ; i++){
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(i == 5){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	};
	
	class Threadb extends Thread {
		
		public synchronized void run() {
			for(int i = 0 ; i < 10 ; i++){
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notifyAll();
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
