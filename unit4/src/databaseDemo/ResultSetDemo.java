package databaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM contact");

        // Move cursor to the last row
        if(rs.last()) {
            System.out.println("Last Row Data: " + rs.getString("fname") + " " + rs.getString("lname"));
        }

        // Move cursor to the first row
        if(rs.first()) {
            System.out.println("First Row Data: " + rs.getString("fname") + " " + rs.getString("lname"));
        }

        // Move cursor to a specific row
        if(rs.absolute(2)) {
            System.out.println("Second Row Data: " + rs.getString("fname") + " " + rs.getString("lname"));
        }

        rs.close();
        stmt.close();
        con.close();
    }
}
