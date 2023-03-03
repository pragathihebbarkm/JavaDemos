package com.demo;

public class InterruptDemo {

	public static void main(String[] args) {
		Utils.printMessage("begin ");
		Thread t = new Thread(new Worker());
		t.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printMessage(" End");
	}
}

class Worker implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printMessage("start");
		for(int i = 1;i<=10; i++) {
			Utils.printMessage(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Utils.printMessage("end");
	}
	
}