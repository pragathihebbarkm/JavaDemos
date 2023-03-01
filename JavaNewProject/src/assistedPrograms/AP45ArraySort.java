package assistedPrograms;

import java.util.Arrays;

public class AP45ArraySort {

	public static void main(String[] args) {
	    int[] arr = {10, 4, 6, 8, 3, 1, 7, 2, 9, 5};
	    int n = arr.length;
	    // Sorting the array in ascending order
	    Arrays.sort(arr);
	    // Displaying the sorted array
	    System.out.println("Sorted Array: ");
	    for(int i = 0; i < n; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    // Finding the fourth smallest element
	    int fourthSmallest = arr[3];
	    // Displaying the fourth smallest element
	    System.out.println("\nThe fourth smallest element is " + fourthSmallest);
	  }
}
