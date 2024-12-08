package unit4JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		String name1 = "shyam";
		String email1 = "shyam@gmail.com";
		String pass1 = "shyam123";
		String gender1 = "male";
		String city1 = "Devghat";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		
//		PreparedStatement ps = con.prepareStatement("Insert into register values('Devdas','dasdev@gmail.com','idontknow','male','deurali')");
		PreparedStatement ps = con.prepareStatement("Insert into register values(?,?,?,?,?)");
		ps.setString(1, name1);
		ps.setString(2, email1);
		ps.setString(3, pass1);
		ps.setString(4, gender1);
		ps.setString(5, city1);
		int i = ps.executeUpdate();
		
		if(i>0) {
			System.out.println("completed");
		}else {
			System.out.println("Failed");
		}
	}

}
