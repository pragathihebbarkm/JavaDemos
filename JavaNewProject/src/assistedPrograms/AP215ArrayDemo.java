package assistedPrograms;

public class AP215ArrayDemo {

	public static void main(String[] args) {
		int[] arr= {3,5,3,2,5,6,3,5,4};
		int sum =0;
		String s="tap";
		
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		for (int p: arr) {
			if(p%2==0) 
				sum+=p;
		}
		System.out.println();
		System.out.println("sum of even numbers is: "+sum);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==3 && arr[i+1]==5) {
				arr[i+1]=0;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			
	}
}
