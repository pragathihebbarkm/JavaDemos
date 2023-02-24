package com.demo;

public class loopsDemo {

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum+" is the sum of odd numbers between 1 and 10");
		
		for(int i=10;i>0;i--) {
			System.out.print(i+" ");
		}
		
		int i=1;
		while(i<=10) {
			System.out.print(i);
			i++;
		}
	}
}
