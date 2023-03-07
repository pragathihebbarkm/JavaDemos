package polymorphismAndSorting;

public class PolymorphismDemo {
	
	public static void main(String[] args) {
		CompileTimePolymorphism ctp = new CompileTimePolymorphism();
		ctp.add(2.0f, 7.5f);
		ctp.add(7, 5);
		ctp.add("Siya", "Rama");
		ctp.add(5, 2, 3);
		
	}
}

class CompileTimePolymorphism {
	
	void add(int a, int b) {
		int res = a+b;
		System.out.println("addition of 2 integers a and b resuts in the value"+res);
	}
	
	void add(float a, float b) {
		float res = a+b;
		System.out.println("addition of 2 floating point values a and b resuts in the value"+res);
	}
	
	void add(int a, int b, int c) {
		int res = a+b+c;
		System.out.println("addition of 3 integer values a,b and c resuts in the value"+res);
	}
	
	void add(String a , String b) {
		String res = a+b;
		System.out.println("concatenation of a and b results in"+res);
	}
}