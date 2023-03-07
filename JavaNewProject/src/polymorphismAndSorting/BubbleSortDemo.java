package polymorphismAndSorting;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		
		int[] numbers = {76, 23,55,44,71,22};
		System.out.println("before sorting: "+Arrays.toString(numbers));
		System.out.println("After Sorting: "+Arrays.toString(bubbleSort(numbers)));
		
	}
	
	static int[] bubbleSort(int[] array) {
		for(int i =0; i<array.length; i++) {
			for(int j =0; j<array.length-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
		
	}
}
