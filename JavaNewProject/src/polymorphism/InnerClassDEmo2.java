package polymorphism;

public class InnerClassDEmo2 {
	public static void main(String[] args) {
	
		Car car = new Car("White");
		car.start();
		
		Car.MusicSystems ms = car.new MusicSystems(3);
		ms.playSomeMusic();
	}
}

class Car {
	
	private static String model = "Tata Nexon";
	private String color;
	
	Car(String color) {
		this.color=color;
	}
	
	void start() {
		System.out.println(color +" car started");
	}
	
	class MusicSystems {
		private int numOfChannels;

		public MusicSystems(int numOfChannels) {
			this.numOfChannels = numOfChannels;
		}
		
		void playSomeMusic() {
			System.out.println("model of car is "+model);
			System.out.println("color of car is "+Car.this.color);
			System.out.println("number of music channels in music system is"+this.numOfChannels);
		}
	}
}