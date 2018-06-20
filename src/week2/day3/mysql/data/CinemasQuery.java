package week2.day3.mysql.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CinemasQuery {

	public static void printQuerysFromCinemas() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?"
				+ "useSSL=false&useUnicode=true&" 
				+ "useJDBCCompliantTimezoneShift=true&"
				+ "useLegacyDatetimeCode=false&" 
				+ "serverTimezone=Europe/Warsaw", "root", "")) {
			
			String query1 = "SELECT * FROM Movies WHERE name LIKE 'W%'";
			String query2 = "SELECT * FROM Tickets WHERE price > 15.30";
			String query3 = "SELECT * FROM Tickets WHERE quantity > 10";
			String query4 = "SELECT * FROM Movies WHERE rating > 5.0";
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query1);
			while (rs.next()) {
				System.out.println("Movies starts at 'W': " + rs.getString("name"));
			}
			rs = stmt.executeQuery(query2);
			while (rs.next()) {
				System.out.println("Tickets with price more than 15.30: " + rs.getInt("quantity"));
			}
			rs = stmt.executeQuery(query3);
			while (rs.next()) {
				System.out.println("Tickets with quantity more than 10: " + rs.getInt("quantity"));
			}
			rs = stmt.executeQuery(query4);
			while (rs.next()) {
				System.out.println("Movies with rating more than 5: " + rs.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		printQuerysFromCinemas();
	}
}
