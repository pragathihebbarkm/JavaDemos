package polymorphismAndSorting;


public class AnnonyClassDemo {

	public static void main(String[] args) {
		PrinterConnection pc = PrinterDriver.getConnection();
		pc.print();
	}
}

class PrinterDriver {
	
	static PrinterConnection getConnection() {
		
		PrinterConnection con = new PrinterConnection() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Printing...");
			}
		};
		return con;
	}
}

interface PrinterConnection{
	
	void print();
}