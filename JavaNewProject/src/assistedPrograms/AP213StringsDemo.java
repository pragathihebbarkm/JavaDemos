package assistedPrograms;

public class AP213StringsDemo {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("World");
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		
		System.out.println("sb1 before append : "+sb1);
		System.out.println("sb2 before append : "+sb2);
		
		s1.concat(s2);
		System.out.println("After concatenation, s1 is: "+s1);
		
		String s3 = s1.concat(s2);
		System.out.println("s3 after concatenation :"+s3);
		
		sb1.append(sb2);
		System.out.println("sb1 after append "+sb1);
		
		System.out.println(sb2.equals(s2));
	}
}
