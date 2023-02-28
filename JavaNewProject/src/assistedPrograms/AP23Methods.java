package assistedPrograms;

public class AP23Methods {

	public static void main(String[] args) {
		Sub_AP23Methods m = new Sub_AP23Methods();
		System.out.println("sum of 2 numbers is "+m.add(2, 3));
		Sub_AP23Methods.displayMsg();
		
	}
}

class Sub_AP23Methods{
	static void displayMsg() {
		System.out.println("this is a static method displayMsg");
	}
	
	public int add(int a , int b) {
		return a+b;
	}
}