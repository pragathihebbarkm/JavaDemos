package practicePrograms;

public class PP16ArithmeticCalculator {

	public int a = 6;
	private final int b = 3;
	static float result;
	
	public PP16ArithmeticCalculator() {
		this.a=12;
	}
	public static void main(String[] args) {
		
		PP16ArithmeticCalculator ac = new PP16ArithmeticCalculator();
		if(ac.a==0 || ac.b==0) {
			throw new ArithmeticException();
		}
		result = ac.a+ac.b;
		System.out.println("sum is "+result);
		result = ac.a-ac.b;
		System.out.println("difference is "+result);
		result = ac.a*ac.b;
		System.out.println("product is "+result);
		result = ac.a/ac.b;
		System.out.println("quotient is "+result);
		result = ac.a%ac.b;
		System.out.println("remainder is "+result);
	}
}
