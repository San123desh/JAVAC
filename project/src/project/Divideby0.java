package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divideby0 {
	
	public static int quotient(int x,int y) {
		return x/y;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean continueloop = true;
		do {
			try {
				System.out.println("Enter for x: ");
				int x = input.nextInt();
				int result = x/0;
				System.out.println("Result: " + result);
			}catch(InputMismatchException ex) {
				System.err.println("Exception" +ex);
//			input.nextLine();
			}
			catch(ArithmeticException aex) {
				System.err.println("Exception: " +aex);
			}
			
		}while(continueloop);
		
		input.close();
		
	}

}
