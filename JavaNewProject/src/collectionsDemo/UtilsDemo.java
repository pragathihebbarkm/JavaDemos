package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilsDemo {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Max");
		myList.add("Joe");
		myList.add("Robert");
		myList.add("Will");
		myList.add("Albert");
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println("after sorting"+myList);	
		
		int res = Collections.binarySearch(myList, "Max");
		System.out.println("Max found at"+res);
		
		Collections.reverse(myList);
		System.out.println(myList);
		
		Collections.sort(myList,new MyComparator());
		System.out.println("reverse sorting"+myList);
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}