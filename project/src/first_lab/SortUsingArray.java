package first_lab;

public class SortUsingArray {

	public static void main(String[] args) {
		int [] arr = new int[] {2,45,65,2,0,-1,11 };
		System.out.println("Original array");
		for(int n:arr) {
			System.out.println(n + " ");
		}
		System.out.println("Array elements after sorting:");  
		for(int i=0;i< arr.length;i++) {
			for(int j= i+1;j < arr.length;j++) {
				if( arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
