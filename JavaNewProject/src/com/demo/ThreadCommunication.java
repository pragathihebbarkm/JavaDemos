package com.demo;

public class ThreadCommunication {

	public static void main(String[] args) {
		myThread m = new myThread();
		Thread tt = new Thread(m);
		tt.setName("MYThread");
		tt.start();
		
		synchronized (tt) {
			Utils.printMessage("going to wait");
			try {
				tt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			Utils.printMessage("notified");
			Utils.printMessage("total="+m.getTotal());
		}
	}
}

class myThread implements Runnable {

	int total;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printMessage("calculating sum");
		synchronized (this) {
			for(int i=1; i<=10; i++) {
				total+=i;
			}
			this.notify();
		}
		Utils.printMessage("calculation completed..notifying");
	}
	
	public int getTotal() {
		return total;
	}
	
}