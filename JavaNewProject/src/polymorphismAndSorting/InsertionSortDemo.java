package polymorphismAndSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSortDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(99);
		numbers.add(44);
		numbers.add(6);
		numbers.add(5);
		numbers.add(55);
		numbers.add(87);
		
		System.out.println("Before Sorting: "+numbers);
		System.out.println("after sorting: "+insertionSort(numbers));
		
	}
	
	static List<Integer> insertionSort(List<Integer> num){
		
		for(int i=1; i<num.size();i++) {
			if(num.get(i) <= num.get(0)) {
				num.add(0,num.get(i));
				num.remove(i+1);
			}
			else if(num.get(i)<num.get(i-1)){
				for(int j=1; j<i; j++) {
					if(num.get(i)<num.get(j)) {
						num.add(j, num.get(i));
						num.remove(i+1);
					}
				}
			}
		}
		return num;
		
	}
}
