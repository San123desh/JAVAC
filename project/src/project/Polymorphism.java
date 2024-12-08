package project;


//Method overriding(Run time)
class Animal{
	void makeSound() {
		System.out.println("Animal making a sound.");
	}
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Dog is barking.");
	}
}

//overloading
class MathOperations{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
}

public class Polymorphism {
	 public static void main(String[] args) {
	 
		 Animal myAnimal = new Dog();
		 myAnimal.makeSound();
	 }

}
