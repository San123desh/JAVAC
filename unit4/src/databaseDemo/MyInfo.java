package databaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MyInfo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		String fName = "Sandesh";
//		String lName = "Shrestha";
//		String cNumber = "1234567890";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		
		String sql = "Insert into contact (fname, lname, cnumber) values('Sita','pradhan','34567890')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();

	}

}
