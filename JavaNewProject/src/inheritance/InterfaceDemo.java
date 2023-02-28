package inheritance;

public class InterfaceDemo {

	public static void main(String[] args) {
		Tata t = new Tata();
		t.accelerate();
		t.go();
	}
}
interface Cars {
	
	public void go();
	void accelerate();
	private void NotTested() {
		
	}
	default void stop() {
		
	}
	static void Tested() {
		
	}
}

class Tata implements Cars {

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("inside tata go()");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("inside tata accelerate");
	}
	
}

