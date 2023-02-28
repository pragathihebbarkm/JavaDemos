package inheritance;

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.powerOn();
	}
}


interface TV{
	
	public default void powerOn() {
		System.out.println("Tv powered on");
	}
}

interface Monitor {

	public default void powerOn() {
		System.out.println("Monitor powered on");
	}
}

class Phone implements TV,Monitor {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		TV.super.powerOn();
		Monitor.super.powerOn();
	}
	
}

