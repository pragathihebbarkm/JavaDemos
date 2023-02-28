package assistedPrograms;

import java.util.Scanner;

public class AP39KeywordsAndCustomExceptions {

	public static void main(String[] args) {
		
		divideByZeroDemo();
		
		throwsKeywordDemo ts = new throwsKeywordDemo();
		ts.StringParserDemo();
		
		ThrowDemo td = new ThrowDemo();
		td.NullPointerDemo();
		
		try {
			// Throw an object of user defined exception
			throw new MyCustomException("Custom exception");
		}
		catch (MyCustomException ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
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
			System.out.println("the value of a and b is"+a+"and"+b);
		}
	}
	
}

class throwsKeywordDemo {
	
	void StringParserDemo() throws NumberFormatException {
		
		String msg="2";
		int i = Integer.parseInt(msg);
		System.out.println("converted integer is:"+i);
	}
}

class ThrowDemo {
	 void NullPointerDemo() {
		
		String s= "abc";
		if(s.isEmpty()){
			System.out.println("the fourth letter of string s is "+s.charAt(3));
		}
		else {
			throw new NullPointerException();
		}
	}
}

//A Class that represents use-defined exception

class MyCustomException extends Exception {
	public MyCustomException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}


