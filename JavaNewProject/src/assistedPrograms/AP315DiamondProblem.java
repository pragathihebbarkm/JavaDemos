package assistedPrograms;

public class AP315DiamondProblem implements MyInterface1, MyInterface2 {

	public void display() {
	      MyInterface1.super.display();
	      //or,
	      MyInterface2.super.display();
	   }      
	   public static void main(String args[]) {
	      AP315DiamondProblem obj = new AP315DiamondProblem();
	      obj.display();
	   }
	   
}

interface MyInterface1{  
	   public static int num = 100;
	   public default void display() {
	      System.out.println("display method of MyInterface1");
	   }
}
	
interface MyInterface2{  
	   public static int num = 1000;
	   public default void display() {
	      System.out.println("display method of MyInterface2");
	   }
}  