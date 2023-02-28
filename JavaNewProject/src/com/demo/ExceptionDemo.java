package com.demo;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a, b;
		float quotient, remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		try {
			quotient = a/b;
			remainder = a%b;
			System.out.println("quotient="+quotient);
			System.out.println("remainder="+remainder);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
