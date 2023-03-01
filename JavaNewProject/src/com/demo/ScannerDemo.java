package com.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		ScannerDemo1();
		ScannerDemo2();
	}
	
	private static void ScannerDemo1() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (press any character to exit): ");
		
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			sum += num;
			System.out.println("Enter a number (press any character to exit): ");
		}
		System.out.println("sum is: "+sum);
	}
	
	private static void ScannerDemo2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student id: ");
		int id = sc.nextInt();
		System.out.println("enter student name: ");
		String name = sc.next();
		System.out.println("enter student score: ");
		double score = sc.nextDouble();
		
		System.out.println("student name is: "+name);
		System.out.println("student id is: "+id);
		System.out.println("student score is: "+score);
		
	}
}
