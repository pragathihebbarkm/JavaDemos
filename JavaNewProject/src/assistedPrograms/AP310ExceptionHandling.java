package assistedPrograms;

import java.util.Scanner;

public class AP310ExceptionHandling {
	public static void main(String[] args) {
		
		divideByZeroDemo();
		StringParserDemo();
		NullPointerDemo();
	}
	
	private static void StringParserDemo() {
		try {
			String msg="hello!";
			int i = Integer.parseInt(msg);
			System.out.println("converted integer is:"+i);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private static void NullPointerDemo() {
		try {
			String s= null;
			System.out.println("length of s is "+s.length());
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void divideByZeroDemo() {
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
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("values of a and b are:"+a+" and "+b);
		}
	}
}
