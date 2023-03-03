package com.demo;

import java.util.Scanner;

public class JoinThreadDemo {

	public static void main(String[] args) {
		Utils.printMessage("sum of n numbers");
		Scanner sc = new Scanner(System.in);
		Utils.printMessage("Enter a number: ");
		int n = sc.nextInt();
		
		Calculator c = new Calculator(n);
		c.start();
		
		try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Utils.printMessage("the sum is: "+c.getSum());
	}
	
}

class Calculator extends Thread {
	
	int n,sum=0;
	public Calculator(int n) {
		this.n = n;
	}
	 
	public void run() {
		for(int i = 1;i<=n; i++) {
			this.sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int getSum() {
		return sum;
	}
}