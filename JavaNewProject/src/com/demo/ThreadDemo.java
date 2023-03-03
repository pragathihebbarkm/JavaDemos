package com.demo;

public class ThreadDemo {

	public static void main(String[] args) {
		
		MultiThreaded mt = new MultiThreaded();
		mt.start();
		
		SingleThreaded st = new SingleThreaded();
		st.printNum();
		
	}
}

class SingleThreaded {
	
	
	void printNum() {
		//System.out.println(Thread.currentThread().getName()+ "|" );
		for(int i = 1; i<=200; i++) {
			System.out.print(Thread.currentThread().getName()+ "|" +i);
		}
	}
}

class MultiThreaded extends Thread {
	public void run() {
		for(int i = 1; i<=200; i++) {
			System.out.println(Thread.currentThread().getName()+ "|" +i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}