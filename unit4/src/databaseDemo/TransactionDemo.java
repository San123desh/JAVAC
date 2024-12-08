package databaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionDemo {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root")) {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load Driver
            con.setAutoCommit(false); // Start transaction
            
            PreparedStatement psInsert = con.prepareStatement("INSERT INTO accounts (balance, account_number) VALUES (?, ?)");
            psInsert.setDouble(1, 300000.00);
            psInsert.setString(2, "1878765");
            psInsert.executeUpdate();

            // Debit
            PreparedStatement psDebit = con.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE account_number = ?");
            psDebit.setDouble(1, 50000.00);
            psDebit.setString(2, "1878765");
            psDebit.executeUpdate();

            // Credit
            PreparedStatement psCredit = con.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE account_number = ?");
            psCredit.setDouble(1, 500000.00);
            psCredit.setString(2, "1878765");
            psCredit.executeUpdate();

            con.commit(); // Commit transaction
            System.out.println("Transaction successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Transaction failed.");
        }
    }
}
