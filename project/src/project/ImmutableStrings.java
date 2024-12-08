package project;

public class ImmutableStrings {

	public static void main(String[] args) {
		String a = "Immutable";
		String b = a;
		
		System.out.println(a == b); //equal
		
		a += "String";
		
		System.out.println(a == b); //not equal

	}

}
