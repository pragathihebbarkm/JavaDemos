package com.demo;

public class ThreadChallenge {

	public static void main(String[] args) {
		Utils.printMessage("mainthread starting...");
		for(int i=0;i<=10;i++) {
			Utils.printMessage("all num: "+i);
		}
		
		OddNum on = new OddNum();
		EvenNum en = new EvenNum();
		Thread te = new Thread(en);
		te.setName("ThreadEven");
		te.start();
		
		Thread to = new Thread(on);
		to.setName("ThreadOdd");
		to.start();
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Utils.printMessage("This is another way of creating threads");
			}
		};
		
		Thread tr = new Thread(r1);
		tr.start();
	}
}

class OddNum implements Runnable {

	@Override
	public void run() {
		Utils.printMessage("odd num thread starting...");
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				Utils.printMessage(" "+i);
			}
		}
	}
	
}

class EvenNum implements Runnable {

	@Override
	public void run() {
		Utils.printMessage("even num thread starting...");
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				Utils.printMessage(" "+i);
			}
		}
	}
	
}