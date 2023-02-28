package assistedPrograms;

public class AP314AbstractionDemo {

	public static void main(String[] args) {
		BMW3Series bmw3 = new BMW3Series();
		bmw3.accelerate();
		bmw3.start();
		
		BMW bmw = new BMW5Series();
		bmw.accelerate();
		bmw.start();
	}
}

abstract class BMW {
	
	void start() {
		System.out.println("BMW started");
	}
	
	abstract void accelerate();
}

class BMW3Series extends BMW {

	@Override
	void accelerate() {
		
		System.out.println("3 times acceleration");
	}
	
}

class BMW5Series extends BMW {

	@Override
	void accelerate() {
		
		System.out.println("5 times acceleration");
		
	}
	
}