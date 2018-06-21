package week2.day4.mysql.edit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMovies {

	String queryMovie = "SELECT id, name FROM Movies";
	String queryDeleteMovie = "DELETE FROM Movies WHERE id = ?";

	public void executeQuery() {
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_ex?"
				+ "useSSL=false&useUnicode=true&" + "useJDBCCompliantTimezoneShift=true&"
				+ "useLegacyDatetimeCode=false&" + "serverTimezone=Europe/Warsaw", "root", "")) {

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(queryMovie);

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}

			Scanner scan = new Scanner(System.in);
			System.out.println("Type movie id to delete");
			while (!scan.hasNextInt()) {
				System.out.println("It is not a number");
				scan.nextLine();
			}
			int id = scan.nextInt();
			scan.close();
			
			PreparedStatement prepStmt = conn.prepareStatement(queryDeleteMovie);
			prepStmt.setInt(1, id);
			prepStmt.executeUpdate();

			rs = stmt.executeQuery(queryMovie);

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DeleteMovies dc = new DeleteMovies();
		dc.executeQuery();
	}
}
