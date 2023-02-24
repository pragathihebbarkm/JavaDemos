package com.demo;

public class operatorsPrg {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		//arithmetic operators
		
		int result = a+b;
		result = a-b;
		result = a*b;
		result = a/b;
		result = a%b;
		
		//unary(++, -- ,!)
		result=a++;
		System.out.println(result);
		result=++a;
		System.out.println(result);
		result=--a;
		result=a--;
		//relational(<,>,<=,>=)
		
		if(a>b)
			System.out.println("a is bigger");
		//logical(|| , &&)
		if(a>b && a!=0) {
			System.out.println("a is a natural number");
		}
		
		if(a>b && a==0) {
			System.out.println("a is a whole number");
		}
		//boolean (true, false)
		boolean eligible = true;
		boolean forbidden = false;
		 if(eligible) {
			 System.out.println("eligible");
		 }
		 if(forbidden) {
			 System.out.println("forbidden");
		 }
		//ternary
		
		int p =2;
		int q =7;
		
		int greaterNum = (p>q)?p:q;
		System.out.println("the bigger number is"+greaterNum);
		
		//assignment 
		
		a+=2;
		b-=3;
		System.out.println(a);
		System.out.println(b);
	}
}
