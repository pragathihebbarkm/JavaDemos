package com.demo;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Monitor m = new Monitor();
		
		Thread t1 = new Thread(new Work(m, "steve"));
		t1.setName("T1");
		
		Thread t2 = new Thread(new Work(m, "roger"));
		t2.setName("T2");
		
		t1.start();
		t2.start();
	}
}

class Work implements Runnable{

	Monitor m;
	String name;
	
	Work(Monitor m , String name){
		this.m=m;
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		m.displayGreeting(name);
	}
	
}
class Monitor {
	public void displayGreeting(String name) {
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				Utils.printMessage("How are you " +name+" ?");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
	