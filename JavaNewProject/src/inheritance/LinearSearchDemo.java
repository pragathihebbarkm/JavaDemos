package inheritance;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int searchItem = 78;
		int[] arr = {12, 45, 67, 78, 89, 54};
		int index = LinearSearch(arr,searchItem);
		
		if(index == -1) {
			System.out.println("Item "+ searchItem+ " not found");
		}
		else {
			System.out.println("Item "+ searchItem + " found at "+ index);
		}
	}

	private static int LinearSearch(int[] arr, int searchItem) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == searchItem) {
				return i;
			}
		}
		return -1;
	}
}
