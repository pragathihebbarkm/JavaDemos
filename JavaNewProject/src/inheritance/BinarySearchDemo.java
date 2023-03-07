package inheritance;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		
		int searchItem = 78;
		int[] arr = {12, 45, 67, 78, 89, 54};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		int index = BinarySearch(arr,searchItem);
		
		
		if(index == -1) {
			System.out.println("Item "+ searchItem+ " not found");
		}
		else {
			System.out.println("Item "+ searchItem + " found at "+ index);
		}
		
	}
	
	private static int BinarySearch(int[] arr, int searchItem) {
		
		int firstIndex = 0;
		int lastIndex = arr.length-1;
		int midIndex = (firstIndex + lastIndex) / 2;
		
		while(firstIndex < lastIndex) {
			if(searchItem > arr[midIndex]) {
				firstIndex = midIndex+1;
			}
			else if(searchItem == arr[midIndex]) {
				return midIndex;
			}
			else {
				lastIndex = midIndex-1;
			}
			midIndex = (firstIndex + lastIndex)/2;
		}
		return -1;
	}
}
