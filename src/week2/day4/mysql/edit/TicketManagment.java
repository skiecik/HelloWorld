package week2.day4.mysql.edit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TicketManagment {

	private String queryTickets = "SELECT * FROM Tickets";
	private String querySell = "UPDATE Tickets SET quantity = ? WHERE id = ?";
	private String queryTicketsId = "SELECT * FROM Tickets WHERE id=?";
	
	public void sellTickets() {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?"
				+ "useSSL=false&useUnicode=true&" + "useJDBCCompliantTimezoneShift=true&"
				+ "useLegacyDatetimeCode=false&" + "serverTimezone=Europe/Warsaw", "root", "")) {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(queryTickets);
			
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("quantity"));
			}
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Type ticket id to sell");
			while (!scan.hasNextInt()) {
				System.out.println("It is not a number");
				scan.nextLine();
			}
			int id = scan.nextInt();
			
			PreparedStatement prep = conn.prepareStatement(queryTicketsId);
			prep.setInt(1, id);
			rs = prep.executeQuery();
			rs.next();
			int quantity = rs.getInt("quantity");
			
			System.out.println("Type how many ticket to sell");
			while (!scan.hasNextInt()) {
				System.out.println("It is not a number");
				scan.nextLine();
			}
			int sold = scan.nextInt();
			scan.close();
			int updateQuantity = quantity - sold;
			
			prep = conn.prepareStatement(querySell);
			prep.setInt(1, updateQuantity);
			prep.setInt(2, id);
			prep.executeUpdate();
			
			rs = stmt.executeQuery(queryTickets);
			
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("quantity"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TicketManagment tickets = new TicketManagment();
		tickets.sellTickets();
	}
}
