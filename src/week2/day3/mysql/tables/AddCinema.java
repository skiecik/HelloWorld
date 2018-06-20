package week2.day3.mysql.tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddCinema {

	static void addCinema(String name, String address) {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?"
				+ "useSSL=false&useUnicode=true&" + "useJDBCCompliantTimezoneShift=true&"
				+ "useLegacyDatetimeCode=false&" + "serverTimezone=Europe/Warsaw", "root", "")) {

			PreparedStatement prepStm = 
					conn.prepareStatement("INSERT INTO Cinemas (name, address) VALUES (?,?)");
			prepStm.setString(1, name);
			prepStm.setString(2, address);
			prepStm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in cimena name:");
		String name = scan.nextLine();
		System.out.println("Type in cinema address");
		String address = scan.nextLine();
		
		addCinema(name, address);
	}
}
