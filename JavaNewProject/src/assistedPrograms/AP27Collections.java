package assistedPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class AP27Collections {

	public static void main(String[] args) {
		demo1();
		demoRandom();
		setDemo();
	}
	
	private static void demo1() {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 10; i <=100; i=i+10) {
			al.add(i);
		}
		System.out.println(al);
		
		al.set(3,101);
		System.out.println(al);
		
		al.remove(0);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		System.out.println(al.indexOf(101));
		
		if(al.contains(100)) {
			System.out.println("true");
		}
		
		LinkedList<Integer> ll = new LinkedList<>(al);
		System.out.println("linked list "+ll);
		
		ll.remove(2);
		ll.remove(3);
		ll.remove(5);
		ll.remove(1);
		System.out.println(ll);
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
