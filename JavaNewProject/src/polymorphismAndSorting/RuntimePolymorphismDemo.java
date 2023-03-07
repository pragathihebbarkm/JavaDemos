package polymorphismAndSorting;

public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
		
		MacBook mca = new MacBookAir();
		MacBook mcp = new MacBookPro();
		mca.start();
		mcp.start();
		mca.shutdown();
		mcp.shutdown();
		
	}
}

class MacBook{
	void start() {
		System.out.println("Macbook started...");
	}
	
	void shutdown() {
		System.out.println("Macbook shutting down...");
	}
}

class MacBookAir extends MacBook{
	
	void start() {
		System.out.println("MacbookAir started...");
	}
	
	void shutdown() {
		System.out.println("MacbookAir shutting down...");
	}
}

class MacBookPro extends MacBook{
	
	void start() {
		System.out.println("MacbookPro started...");
	}
	
	void shutdown() {
		System.out.println("MacbookPro shutting down...");
	}
}