package databaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDeleteDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		
		//Update row
		String updatesql = "Update contact set fname = 'Hari' where lname = 'PRASHAD' ";
		PreparedStatement ps = con.prepareStatement(updatesql);
		ps.executeUpdate();

		
		//Update row
		String deletesql = "Delete from contact where fname = 'kriteeka' ";
		PreparedStatement psDelete = con.prepareStatement(deletesql);
		psDelete.executeUpdate();

	}

}
