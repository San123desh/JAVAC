package filesHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private String name;
	private int age;
	private String gender;
	
	public Student(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		return "Name: " + name + " Age: " + age + " Gender: " + gender ;

	}
}


public class Serialization {

	public static void main(String[] args) {
		Student s1 = new Student("Ram", 22,"Male");
		Student s2 = new Student("Hari", 24, "Male");
		
		File file = new File("student.txt");
		try {
			FileOutputStream f = new FileOutputStream(file);
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			//writing obj to file
			o.writeObject(s1);
			o.writeObject(s2);
			o.close();
			f.close();
			
			System.out.println("Objects written to file");
			
			//reading obj from a file
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			//read obj
			Student st1 = (Student) oi.readObject();
			Student st2 = (Student) oi.readObject();
			
			System.out.println("Student 1 : " + st1.toString());
			System.out.println("Student 2 : " + st2.toString());
			fi.close();
			oi.close();
		}
		catch(Exception ex) {
			
		}
	}
}
