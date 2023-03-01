package collectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;


public class ArrayListDemo {
	public static void main(String[] args) {
		demo1();
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
}

