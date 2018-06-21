package week2.day4.mysql.edit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaManagment {

	private String queryMovie = "SELECT * FROM Cinemas";
	private String queryEdit = "UPDATE Cinemas SET name=?, address=? WHERE id=?";
	private String queryDelete = "DELETE FROM Cinemas WHERE id=?";
	
	public void manageCinema() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?"
				+ "useSSL=false&useUnicode=true&" 
				+ "useJDBCCompliantTimezoneShift=true&"
				+ "useLegacyDatetimeCode=false&" 
				+ "serverTimezone=Europe/Warsaw", "root", "")) {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(queryMovie);
			List<Integer> idCol = new ArrayList<>();
			
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " " + rs.getString("address"));
				idCol.add(rs.getInt("id"));
			}

			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.println("Type: 'e' for edit, 'd' for delete, 'x' for exit.");
				String option = scan.nextLine();
				if ("x".equals(option)) {
					break;
				} else if ("e".equals(option)) {
					System.out.println("Type cinema id you wnat to edit");
					while (!scan.hasNextInt()) {
						System.out.println("It is not a number");
						scan.nextLine();
					}
					String strId = scan.nextLine();
					int id = Integer.parseInt(strId);
					if (idCol.contains(id)) {
						System.out.println("Type new name for Cinema");
						String name = scan.nextLine();
						System.out.println("Type new address for Cinema");
						String address = scan.nextLine();
						PreparedStatement prep = conn.prepareStatement(queryEdit);
						prep.setString(1, name);
						prep.setString(2, address);
						prep.setInt(3, id);
						prep.executeUpdate();
						
						rs = stmt.executeQuery(queryMovie);
						while(rs.next()) {
							System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " " + rs.getString("address"));
						}
						
					} else {
						System.out.println(id + " not exist in DB");
					}					
				} else if ("d".equals(option)) {
					System.out.println("Type Cinema id to delete");
					while (!scan.hasNextInt()) {
						System.out.println("It is not a number");
						scan.nextLine();
					}
					String strId = scan.nextLine();
					int id = Integer.parseInt(strId);
					if (idCol.contains(id)) {
						PreparedStatement prep = conn.prepareStatement(queryDelete);
						prep.setInt(1, id);
						prep.executeUpdate();
						
						rs = stmt.executeQuery(queryMovie);
						while(rs.next()) {
							System.out.println(rs.getInt("id") + ": " + rs.getString("name") + " " + rs.getString("address"));
						}
						
					} else {
						System.out.println(id + " not exist in DB");
					}	
				} else {
					System.out.println("Not a valid option");
				}
			}
			System.out.println("Bye bye");
			scan.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CinemaManagment cinMan = new CinemaManagment();
		cinMan.manageCinema();
	}
}
