package com.demo;

public class RunnableDemo {

	public static void main(String[] args) {
		Utils.printMessage("begin main");
		ImageProcessor ip = new ImageProcessor();
		Thread tp = new Thread(ip);
		tp.start();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Utils.printMessage("thread t1 started");
			}
		});
		
		t1.start();
		Utils.printMessage("end main");
	}
}

class ImageProcessor implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printMessage("Processing image");
	}
	
}