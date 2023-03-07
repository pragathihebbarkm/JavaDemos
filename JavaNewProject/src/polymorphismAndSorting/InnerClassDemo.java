package polymorphismAndSorting;

public class InnerClassDemo {

	public static void main(String[] args) {
		
		ElectronicDevice.powenOn();
		
		ElectronicDevice.Chip.displayBrandName();
		
		ElectronicDevice.Chip obj = new ElectronicDevice.Chip();
		obj.specs();
		
		ElectronicDevice laptop = new ElectronicDevice();
		ElectronicDevice.Processor proc = laptop.new Processor();
		proc.getVoltage();
	}
}

class ElectronicDevice {
	
	static void powenOn() {
		System.out.println("Device powered on");
	}
	
	static class Chip {
		static void displayBrandName() {
			System.out.println("From Sony");
		}
		
		void specs() {
			System.out.println("Specifications for chip");
		}
	}
	
	class Processor{
		void getVoltage() {
			System.out.println("Display voltage of the procesor");
		}
	}
}