package com.demo;

public class FunctionalPrgDemo {

	public static void main(String[] args) {
		
		//traditionally calling functions
		Calci c = new Calci();
		c.calculate(2, 3);
		
		//anonymous class
		Icalculator ica = new Icalculator() {
			
			@Override
			public int calculate(int a, int b) {
				int res = a+b;
				System.out.println("sum is equal to "+res);
				return res;
			}
		};
		ica.calculate(5,5);
		
		//lambda expressions
		int x = 2, y=2;
		Icalculator ic = (a,b)->{return a*b;};
		System.out.println("the product is "+ic.calculate(x, y));
		
		Sum sum = (a,b)-> System.out.println("sum is "+(a+b));
		sum.add(15, 10);
	}
}

interface Icalculator {
	int calculate(int a, int b);
}

class Calci implements Icalculator{

	@Override
	public int calculate(int a, int b) {
		int result = a+b;
		System.out.println("sum = "+result);
		return result;
	}
	
}

interface Sum {
	void add(int a, int b);
}