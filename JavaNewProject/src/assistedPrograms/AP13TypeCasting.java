package assistedPrograms;

public class AP13TypeCasting {

	public static void main(String[] args) {
		
		int j,i = 100;
		long l;
		float f;
		
		//implicit casting(widening)
		
		l=i;
		System.out.println("value of l is "+l);
		f=l;
		System.out.println("value of f is "+f);
		
		//explicit casting (narrowing)
		
		i=(int) l;
		System.out.println("value of i is "+i);
		j=(int) f;
		System.out.println("value of j is "+j);
		
		
	}
}
