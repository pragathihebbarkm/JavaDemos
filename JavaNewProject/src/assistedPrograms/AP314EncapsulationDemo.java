package assistedPrograms;

class EncapsulationDemo {

	private int numOfSeats;
	public static String manufacturer = "Tata";
	private boolean customisable;
	
	public EncapsulationDemo() {
		numOfSeats = 5;
		customisable = true ;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		if(customisable) {
			this.numOfSeats = numOfSeats;
		}
	}
		
	
	
}

public class AP314EncapsulationDemo {
	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.getNumOfSeats();
		ed.setNumOfSeats(7);
	}
}
