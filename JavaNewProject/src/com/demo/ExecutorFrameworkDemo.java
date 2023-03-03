package com.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkDemo {
	public static void main(String[] args) {
	
		VideoProcessorTask[] tasks = {
				new VideoProcessorTask("bank"),
				new VideoProcessorTask("school"),
				new VideoProcessorTask("hospital"),
				new VideoProcessorTask("Conference")};
		
			ExecutorService newfixedThreadPool = Executors.newFixedThreadPool(4);
		
			for(VideoProcessorTask vpt : tasks) {
				newfixedThreadPool.submit(vpt);
			}
			newfixedThreadPool.shutdown();
	}
	
}

class VideoProcessorTask implements Runnable{

	String sourcename;
	
	public VideoProcessorTask(String sourcename) {
		// TODO Auto-generated constructor stub
		this.sourcename=sourcename;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Utils.printMessage("Processing video from "+sourcename+" started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printMessage("Processing video from "+sourcename+" ended");
	}
	
}