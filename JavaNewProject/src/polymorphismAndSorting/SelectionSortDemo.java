package polymorphismAndSorting;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int[] numbers = {76, 23,55,44,71,22};
		System.out.println("Before Sorting: "+Arrays.toString(numbers));
		System.out.println("after sorting: "+Arrays.toString(selectionSort(numbers)));
		
	}
	
	static int[] selectionSort(int[] array) {
		for(int i =0; i<array.length; i++) {
			int indexOfSmallest = i;
			for(int j =i; j<array.length; j++) {
				if(array[j]<array[indexOfSmallest]) {
					indexOfSmallest=j;
				}
			}
			int temp = array[i];
			array[i] = array[indexOfSmallest];
			array[indexOfSmallest] = temp;
		}
		return array;
		
	}
}
