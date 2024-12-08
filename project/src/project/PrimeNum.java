package project;

public class PrimeNum {

	public static void main(String[] args) {
		
		int n =9;
		int sum=0;
		System.out.println("Result: ");
		for(int i =1;i<n;i++) {
			boolean isPrime = true;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(+ i);
				sum += i;
			}
			
		}
		System.out.println("Sum: " + sum);

	}

}
