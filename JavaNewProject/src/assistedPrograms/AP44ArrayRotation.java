package assistedPrograms;

public class AP44ArrayRotation {

	public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int n = arr.length;
	    int k = 5;
	    // Displaying the original array
	    System.out.println("Original Array: ");
	    for(int i = 0; i < n; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    // Right rotating the array by k steps
	    for(int i = 0; i < k; i++) {
	      int temp = arr[n-1];
	      for(int j = n-1; j > 0; j--) {
	        arr[j] = arr[j-1];
	      }
	      arr[0] = temp;
	    }
	    // Displaying the rotated array
	    System.out.println("\nRotated Array: ");
	    for(int i = 0; i < n; i++) {
	      System.out.print(arr[i] + " ");
	    }
	  }
}
