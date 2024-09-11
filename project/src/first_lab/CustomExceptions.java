package first_lab;

import java.util.Scanner;
 
class AgeException extends Exception{
	public AgeException(String msg) {
		
		super(msg);
	}
}

public class CustomExceptions {
	
	public static void checkAge(int age) throws AgeException{
		if(age < 18) {
			throw new AgeException("Not eligible to Ride.");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		
		try {
			System.out.println("Enter age: ");
			age = input.nextInt();
			checkAge(age);
			System.out.println("You are eligible to Ride.");
		}catch(AgeException ex) {
			System.out.println(ex.getMessage());
		}
		input.close();
	
	}

}
