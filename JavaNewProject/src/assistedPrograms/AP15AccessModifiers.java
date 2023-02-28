package assistedPrograms;

class CarEncapsulation {

	String color = "White";
	public int numOfWheels;
	private int numOfSeats;
	public static String manufacturer = "Tata";
	private boolean customisable;
	
	public CarEncapsulation() {
		color = "Silver";
		numOfWheels=4;
		numOfSeats=7;
		customisable=false; 
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		if(customisable)
			this.numOfSeats = numOfSeats;
	}
	
	
}

public class AP15AccessModifiers{
	public static void main(String[] args) {
		CarEncapsulation cen = new CarEncapsulation();
		cen.getNumOfSeats();
		cen.setNumOfSeats(4);
	}
}