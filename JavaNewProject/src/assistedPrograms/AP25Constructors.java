package assistedPrograms;

public class AP25Constructors {

	String msg;
	public AP25Constructors() {
		System.out.println("this is a default constructor");
	}
	
	public AP25Constructors(String msg) {
		this.msg=msg;
		System.out.println(this.msg);
	}
	public static void main(String[] args) {
		AP25Constructors dc = new AP25Constructors();
		AP25Constructors pc = new AP25Constructors("parameterized constructor");
	}
}
