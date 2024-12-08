package project;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		int a = 0;
		int b = 1;
		
		if(n < 0) {
			System.out.println("Cannot b negative");
		}
		
		if(n == 0) System.out.println(a);
		else if(n == 1) System.out.println(b);
		else {
			int c = 0;
			System.out.println("Result");
			for(int i=2;i<=n;i++) {
				c = a + b;
				a = b;
				b = c;
				System.out.println(c);
			}
		}
		input.close();

	}

}
