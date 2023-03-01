package collectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
	
		demoRandom();
		setDemo();
	}
	
	private static void demoRandom() {
		Random obj = new Random();
		int x = obj.nextInt(10,20);
		System.out.println(x);
	}
	
	private static void setDemo() {
		Random random = new Random();
		ArrayList< Integer> al = new ArrayList<>();
		for (int i = 0; i <=10; i++) {
			al.add(random.nextInt(10,17));
		}
		
		System.out.println(al);
		
		Set<Integer> set1 = new HashSet<>(al);
		System.out.println(set1);
		
		Set<Integer> set2 = new LinkedHashSet<>(al);
		System.out.println(set2);
		
		Set<Integer> set3 = new TreeSet<>(set1);
		System.out.println(set3);
		  
	}
}
