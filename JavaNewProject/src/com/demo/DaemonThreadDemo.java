package com.demo;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		Utils.printMessage(""+Thread.currentThread().isDaemon());
		
		Worker1 w1 = new Worker1();
		w1.setDaemon(true);
		
		Utils.printMessage(w1.isDaemon());
		w1.start();
		try {
			w1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Worker1 extends Thread {
	
	public void run() {
		for(int i=1;i<=10;i++) {
			Utils.printMessage(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}